package com.apsoftware.insomniacgoat.viewmodel.repository

import android.content.Context
import com.apsoftware.insomniacgoat.model.DataReadyCallback
import com.apsoftware.insomniacgoat.model.StatLine
import com.apsoftware.insomniacgoat.model.database.LocalDataProvider
import com.apsoftware.insomniacgoat.model.network.ConnectivityManager
import com.apsoftware.insomniacgoat.model.network.RemoteDataProvider
import com.apsoftware.insomniacgoat.model.simple_local_storage.MockDataProvider

class PlayerStatsRepository(context: Context) {

    val localDataProvider: LocalDataProvider = LocalDataProvider()
    val remoteDataProvider: RemoteDataProvider = RemoteDataProvider()
    val mockDataProvider: MockDataProvider = MockDataProvider()
    val connectivityManager: ConnectivityManager = ConnectivityManager(context)
    val mockDataEnabled = true

    fun getPlayerData(onRepositoryReadyCallback: OnRepositoryReadyCallback) {
        if(mockDataEnabled){
            mockDataProvider.getStats(object : DataReadyCallback {
                override fun onDataReady(data: List<StatLine>) {
                    localDataProvider.updateData(data)
                    onRepositoryReadyCallback.onRepositoryReady(data)
                }
            });
        } else {
            if (connectivityManager.isConnectedToInternet?.let { it } ?: false) {
                remoteDataProvider.getStats(object : DataReadyCallback {
                    override fun onDataReady(data: List<StatLine>) {
                        localDataProvider.updateData(data)
                        onRepositoryReadyCallback.onRepositoryReady(data)
                    }
                })

            }
        }
    }

    interface OnRepositoryReadyCallback {
        fun onRepositoryReady(data: List<StatLine>)

    }
}