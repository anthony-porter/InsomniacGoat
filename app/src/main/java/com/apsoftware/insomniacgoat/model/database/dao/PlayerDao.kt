package com.apsoftware.insomniacgoat.model.database.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.apsoftware.insomniacgoat.model.database.entiy.Player

/**
 * Created by Anthony.Porter on 2019-05-19.
 */
@Dao
interface PlayerDao {

    @Insert
    fun insert(player: Player)

    @Query("SELECT * FROM player WHERE id = :id")
    fun getPlayerById(id: Int): Player

    @Delete
    fun delete(vararg player: Player): Int

}