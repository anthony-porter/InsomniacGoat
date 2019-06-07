package com.apsoftware.insomniacgoat.model.network

import androidx.lifecycle.LiveData
import com.apsoftware.insomniacgoat.model.database.entity.PlayerGameStatLine
import com.apsoftware.insomniacgoat.model.database.entity.PlayerSeasonStatLine
import com.apsoftware.insomniacgoat.model.database.entity.Team
import java.util.*

/**
 * Created by Anthony.Porter on 2019-06-03.
 */
class ballDontLieApiDataSourceImpl(private val ballDontLieApi: BallDontLieApi): BallDontLieApiDataSource {
    /**
     * Get a season averages for every season the player was in the NBA
     * @param playerId id for the player to get stats for
     * @return LiveData containing all of the season averages for the player
     */
    override suspend fun getSeasonStats(playerId: Int): LiveData<List<PlayerSeasonStatLine>> {
    }

    /**
     * Get the season averages of a specific season for a player
     * @param playerId id for the player to get stats for
     * @param year the year the season to get stats for ended in
     * @return LiveData containing the season averages for the player and the given year
     */
    override suspend fun getSeasonStats(playerId: Int, year: Int): LiveData<PlayerSeasonStatLine> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    /**
     * Get the game stats for a player in a specific game
     * @param playerId id for the player to get stats for
     * @param gameId id for the game to get stats for
     * @return LiveData with the stats for the player in the given game
     */
    override suspend fun getGameStats(playerId: Int, gameId: Int): LiveData<PlayerGameStatLine> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    /**
     * Get a player's stats for each game that took place within the date. Can be games on a specific day, specific month,
     * or specific year.
     * @param playerId id for the player to get stats for
     * @param date day, month, or year to filter games by
     * @return LiveData containing a list of all the games for a player that took place withing the date
     */
    override suspend fun getGameStats(playerId: Int, date: Date): LiveData<PlayerGameStatLine> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    /**
     * Get a player's stats for each playoff game for the given year. To get a specific
     * @param playerId id for the player to get stats for
     * @param year the year the playoff games took place
     * @return LiveData containing a list of all of the playoff games for a player that took place for the given year
     */
    override suspend fun getPlayoffGameStats(playerId: Int, year: Int): LiveData<List<PlayerGameStatLine>> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    /**
     * Get a player's stats for each game in the date range
     * @param playerId id for the player to get stats for
     * @param startDate first date to filter games by
     * @param endData last date to filter games by
     * @return LiveData containing a list of all of the games for a player that took place in the date range
     */
    override suspend fun getGameStats(
        playerId: Int,
        startDate: Date,
        endDate: Date
    ): LiveData<List<PlayerGameStatLine>> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    /**
     * Get all current teams in the NBA
     * @return LiveData containing a list of all teams currently in the NBA
     */
    override suspend fun getTeams(): LiveData<List<Team>> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    /**
     * Get all players with a given first and last name
     * @param firstName first name of the player to search for
     * @param lastName last name of the player to search for
     * @return LiveData with a list of all players with the given first and last name
     */
    override suspend fun getPlayer(firstName: String, lastName: String): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}