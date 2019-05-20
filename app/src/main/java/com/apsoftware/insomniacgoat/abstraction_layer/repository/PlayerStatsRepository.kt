package com.apsoftware.insomniacgoat.abstraction_layer.repository

import android.content.Context
import com.apsoftware.insomniacgoat.model.database.LocalDataProvider
import com.apsoftware.insomniacgoat.model.database.entity.Player
import com.apsoftware.insomniacgoat.model.database.entity.PlayerSeasonStatLine
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
    fun getPlayerData(): Observable<List<Player>> {
        return when {
            mockDataEnabled -> mockDataProvider.getStats()
            connectivityManager.isConnectedToInternet?.let { it } == true -> remoteDataProvider.getPlayers()
            else -> localDataProvider.getPlayers()
        }
    }

    fun getTopScoredPlayers(): Observable<List<Player>> {
        return localDataProvider.getTopScoredPlayers()
    }

    interface OnRepositoryReadyCallback {
        fun onRepositoryReady(data: List<PlayerSeasonStatLine>)

    }
}