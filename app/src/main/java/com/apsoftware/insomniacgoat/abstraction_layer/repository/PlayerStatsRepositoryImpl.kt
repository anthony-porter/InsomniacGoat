package com.apsoftware.insomniacgoat.abstraction_layer.repository

import android.content.Context
import com.apsoftware.insomniacgoat.model.database.LocalDataProvider
import com.apsoftware.insomniacgoat.model.database.dao.PlayerDao
import com.apsoftware.insomniacgoat.model.database.dao.PlayerSeasonStatLineDao
import com.apsoftware.insomniacgoat.model.database.entity.Player
import com.apsoftware.insomniacgoat.model.database.entity.PlayerSeasonStatLine
import com.apsoftware.insomniacgoat.model.network.ConnectivityManager
import com.apsoftware.insomniacgoat.model.network.RemoteDataProvider
import com.apsoftware.insomniacgoat.model.simple_local_storage.MockDataProvider
import com.apsoftware.insomniacgoat.providers.NetworkStatusProvider
import io.reactivex.Observable


/**
 * Repository for player stats.
 *
 * Created by Anthony.Porter
 */
class PlayerStatsRepository(private val playerDao: PlayerDao,
                            private val playerSeasonStatLineDao: PlayerSeasonStatLineDao,
                            private val networkStatusProvider: NetworkStatusProvider): {

    private val localDataProvider: LocalDataProvider = LocalDataProvider()
    private val remoteDataProvider: RemoteDataProvider = RemoteDataProvider()
    private val mockDataProvider: MockDataProvider = MockDataProvider()
    private val mockDataEnabled = true

    /**
     * return all player data
     * // todo remove mock variable. This is bad design for testing
     */
    fun getPlayerData(): Observable<List<Player>> {
        return when {
            mockDataEnabled -> mockDataProvider.getStats()
            networkStatusProvider.isOnline().let { it } -> remoteDataProvider.getPlayers()
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