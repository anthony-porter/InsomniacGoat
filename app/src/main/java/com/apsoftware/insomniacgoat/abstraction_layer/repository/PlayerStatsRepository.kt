package com.apsoftware.insomniacgoat.abstraction_layer.repository

import android.content.Context
import com.apsoftware.insomniacgoat.model.DataReadyCallback
import com.apsoftware.insomniacgoat.model.StatLine
import com.apsoftware.insomniacgoat.model.database.LocalDataProvider
import com.apsoftware.insomniacgoat.model.network.ConnectivityManager
import com.apsoftware.insomniacgoat.model.network.RemoteDataProvider
import com.apsoftware.insomniacgoat.model.simple_local_storage.MockDataProvider
import io.reactivex.Observable


/**
 * Repository for player stats.
 *
 * Created by Anthony.Porter
 */
class PlayerStatsRepository(context: Context) {

    private val localDataProvider: LocalDataProvider = LocalDataProvider()
    private val remoteDataProvider: RemoteDataProvider = RemoteDataProvider()
    private val mockDataProvider: MockDataProvider = MockDataProvider()
    private val connectivityManager: ConnectivityManager = ConnectivityManager(context)
    private val mockDataEnabled = true

    /**
     * return all player data
     * // todo remove mock variable. This is bad design for testing
     */
    fun getPlayerData(): Observable<List<StatLine>> {
        if(mockDataEnabled) {
            return mockDataProvider.getStats()
        } else if(connectivityManager.isConnectedToInternet?.let{ it } == true) {
            return remoteDataProvider.getStats()
        } else {
            return localDataProvider.getStats()
        }
    }

    fun getTopScoredPlayers(): Observable<List<StatLine>> {
        return localDataProvider.getTopScoredPlayers()
    }

    @Deprecated("No longer supported Callback interfaces will be removed", ReplaceWith("getPlayerData()"))
    fun getPlayerData(onRepositoryReadyCallback: OnRepositoryReadyCallback) {
        if(mockDataEnabled){
            mockDataProvider.getStats(object : DataReadyCallback {
                override fun onDataReady(data: List<StatLine>) {
                    localDataProvider.updateData(data)
                    onRepositoryReadyCallback.onRepositoryReady(data)
                }
            });
        } else {
            if (connectivityManager.isConnectedToInternet?.let { it } == true) {
                remoteDataProvider.getStats().flatMap {
                    return@flatMap localDataProvider.updateData(it)
                        .toSingleDefault(it)
                        .toObservable()
                }

            }
        }
    }

    interface OnRepositoryReadyCallback {
        fun onRepositoryReady(data: List<StatLine>)

    }
}