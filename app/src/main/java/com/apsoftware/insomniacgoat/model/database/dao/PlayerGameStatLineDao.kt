package com.apsoftware.insomniacgoat.model.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.apsoftware.insomniacgoat.model.database.entity.PlayerGameStatLine
import java.util.*

/**
 * Created by Anthony.Porter on 2019-06-01.
 */
@Suppress("unused")
@Dao
interface PlayerGameStatLineDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(playerGameStatLine: PlayerGameStatLine)

    @Query("")
    fun getPlayerGameStateLine(playerId: Int, season: Int)

    @Query("")
    fun getPlayerGameStateLine(playerId: Int, date: Date)

    @Query("")
    fun getPlayerGameStateLine(playerGameStatLineId: Int)


}