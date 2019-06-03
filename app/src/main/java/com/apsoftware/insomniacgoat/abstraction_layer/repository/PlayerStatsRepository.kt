package com.apsoftware.insomniacgoat.abstraction_layer.repository

import androidx.lifecycle.LiveData
import com.apsoftware.insomniacgoat.model.database.entity.Player
import com.apsoftware.insomniacgoat.model.database.entity.PlayerGameStatLine
import com.apsoftware.insomniacgoat.model.database.entity.PlayerSeasonStatLine

/**
 * Created by Anthony.Porter on 2019-05-26.
 */
interface PlayerStatsRepository {

    /**
     * Get all of the season stats for a player
     * @param playerId ID used to find the correct player
     * @return LiveData containing a PlayerSeasonStatLine for every year the player was in the NBA
     */
    suspend fun getStats(playerId: Int): LiveData<List<PlayerSeasonStatLine>>

    /**
     * Get player stats for a particular season
     * @param playerId ID used to find the correct player
     * @param year The year the season ended
     * @return LiveData containing the PlayerSeasonStatLine
     */
    suspend fun getStats(playerId: Int, year: Int): LiveData<PlayerSeasonStatLine>

    /**
     * Get the players with the highest ranks
     * @param count number of players to return
     * @return LiveData containing the top ranked players
     */
    suspend fun getTopScoredPlayers(count: Int): LiveData<List<Player>>

    /**
     * Get all players
     * @return all players in the database
     */
    suspend fun getPlayers(): LiveData<List<Player>>

    /**
     * Add an player to the database
     * @param player Player to be added to the database
     */
    suspend fun addPlayer(player: Player)

    /**
     * Update the current season with updated data
     * @paramm PlayerSeasonStatLine season to be updated
     * @return the success of the update operation
      */
    suspend fun updateData(playerSeasonStatLine: PlayerSeasonStatLine): Boolean

    /**
     * Update a game with updated data
     * @param playerGameStatLine PlayerGameStateLine to be updated
     * @return the success of the update operation
     */
    suspend fun updateData(playerGameStatLine: PlayerGameStatLine): Boolean

}