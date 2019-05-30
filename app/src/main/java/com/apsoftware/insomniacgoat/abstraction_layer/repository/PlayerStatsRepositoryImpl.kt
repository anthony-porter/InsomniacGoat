package com.apsoftware.insomniacgoat.abstraction_layer.repository

import androidx.lifecycle.LiveData
import com.apsoftware.insomniacgoat.model.database.dao.PlayerDao
import com.apsoftware.insomniacgoat.model.database.dao.PlayerSeasonStatLineDao
import com.apsoftware.insomniacgoat.model.database.entity.Player
import com.apsoftware.insomniacgoat.model.database.entity.PlayerSeasonStatLine
import com.apsoftware.insomniacgoat.model.network.NbaApi
import com.apsoftware.insomniacgoat.providers.NetworkStatusProvider


/**
 * Repository for player stats.
 *
 * Created by Anthony.Porter
 */
class PlayerStatsRepositoryImpl(private val playerDao: PlayerDao,
                                private val playerSeasonStatLineDao: PlayerSeasonStatLineDao,
                                private val nbaApi: NbaApi,
                                private val networkStatusProvider: NetworkStatusProvider) : PlayerStatsRepository {
    override suspend fun updateData(data: List<PlayerSeasonStatLine>) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override suspend fun getStats(playerId: Int): LiveData<List<PlayerSeasonStatLine>> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override suspend fun getTopScoredPlayers(): LiveData<List<Player>> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override suspend fun getPlayers(): LiveData<List<Player>> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override suspend fun addPlayer(player: Player) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override suspend fun updateData(playerSeasonStatLine: PlayerSeasonStatLine) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}