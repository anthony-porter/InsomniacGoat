package com.apsoftware.insomniacgoat.model.database.dao

import androidx.room.*
import com.apsoftware.insomniacgoat.model.database.entity.PlayerSeasonStatLine

/**
 * Created by Anthony.Porter on 2019-05-19.
 */
@Suppress("unused")
@Dao
interface PlayerSeasonStatLineDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(playerSeasonStatLines: List<PlayerSeasonStatLine>)

    fun insert(playerSeasonStatLine: PlayerSeasonStatLine)

    @Query("SELECT * FROM playerSeasonStatLine WHERE player_id = :playerId")
    fun getSeasonStatLinesByPlayer(playerId: Int): List<PlayerSeasonStatLine>

    @Query("SELECT * FROM PlayerSeasonStatLine WHERE id = :id")
    fun getSeasonStatLine(id: Int): PlayerSeasonStatLine

    @Delete
    fun delete(vararg playerSeasonStatLine: PlayerSeasonStatLine): Int
}