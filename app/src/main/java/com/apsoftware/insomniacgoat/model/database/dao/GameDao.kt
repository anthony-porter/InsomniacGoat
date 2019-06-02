package com.apsoftware.insomniacgoat.model.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.apsoftware.insomniacgoat.model.database.entity.Game
import com.apsoftware.insomniacgoat.model.database.entity.Team
import java.util.*

/**
 * Created by Anthony.Porter on 2019-06-01.
 */
@Suppress("unused")
@Dao
interface GameDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(game: Game)

    @Query("")
    fun getGame(team: Team, date: Date)

    @Query("")
    fun getGames(team: Team, startDate: Date, endDate: Date)

    @Query("")
    fun getGames(date: Date)

    @Query("")
    fun getPlayoffGames(season: Int)

    @Query("")
    fun getPlayoffGames(team: Team, season: Int)

}