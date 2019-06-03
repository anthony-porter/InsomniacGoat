@file:Suppress("unused")

package com.apsoftware.insomniacgoat.abstraction_layer.repository

import androidx.lifecycle.LiveData
import com.apsoftware.insomniacgoat.model.database.dao.PlayerDao
import com.apsoftware.insomniacgoat.model.database.dao.PlayerSeasonStatLineDao
import com.apsoftware.insomniacgoat.model.database.entity.Player
import com.apsoftware.insomniacgoat.model.database.entity.PlayerGameStatLine
import com.apsoftware.insomniacgoat.model.database.entity.PlayerSeasonStatLine
import com.apsoftware.insomniacgoat.model.network.NbaApi
import com.apsoftware.insomniacgoat.providers.NetworkStatusProvider


/**
 * Repository for players
 *
 * Created by Anthony.Porter
 */
class PlayerStatsRepositoryImpl(private var playerDao: PlayerDao,
                                private var playerSeasonStatLineDao: PlayerSeasonStatLineDao,
                                private var nbaApi: NbaApi,
                                private var networkStatusProvider: NetworkStatusProvider) : PlayerStatsRepository {
    /**
     * Get player stats for a particular season
     * @param playerId ID used to find the correct player
     * @param year The year the season ended
     * @return LiveData containing the PlayerSeasonStatLine
     */
    override suspend fun getStats(playerId: Int, year: Int): LiveData<PlayerSeasonStatLine> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    /**
     * Get the players with the highest ranks
     * @param count number of players to return
     * @return LiveData containing the top ranked players
     */
    override suspend fun getTopScoredPlayers(count: Int): LiveData<List<Player>> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    /**
     * Update a game with updated data
     * @param playerGameStatLine PlayerGameStateLine to be updated
     * @return the success of the update operation
     */
    override suspend fun updateData(playerGameStatLine: PlayerGameStatLine): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    /**
     * Update the current season with updated data
     * @paramm PlayerSeasonStatLine season to be updated
     * @return the success of the update operation
     */
    override suspend fun updateData(playerSeasonStatLine: PlayerSeasonStatLine): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    /**
     * Get all of the season stats for a player
     * @param playerId ID used to find the correct player
     * @return LiveData containing a PlayerSeasonStatLine for every year the player was in the NBA
     */
    override suspend fun getStats(playerId: Int): LiveData<List<PlayerSeasonStatLine>> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    /**
     * Get all players available in the database
     * @return Live data with list of all players in database
     */
    override suspend fun getPlayers(): LiveData<List<Player>> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    /**
     * Add player to room database
     * @param player The NBA player to be added to the database
     */
    override suspend fun addPlayer(player: Player) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}