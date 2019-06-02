package com.apsoftware.insomniacgoat.model.database.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.apsoftware.insomniacgoat.model.database.entity.PlayerSeasonStatLine

/**
 * Created by Anthony.Porter on 2019-05-19.
 */
@Suppress("unused")
@Dao
interface PlayerSeasonStatLineDao {

    @Insert
    fun insert(playerSeasonStatLine: PlayerSeasonStatLine)

    @Query("SELECT * FROM playerSeasonStatLine WHERE player_id = :playerId")
    fun getSeasonStatLinesByPlayer(playerId: Int): List<PlayerSeasonStatLine>

    @Query("SELECT * FROM PlayerSeasonStatLine WHERE id = :id")
    fun getSeasonStatLine(id: Int): PlayerSeasonStatLine

    @Delete
    fun delete(vararg playerSeasonStatLine: PlayerSeasonStatLine): Int
}