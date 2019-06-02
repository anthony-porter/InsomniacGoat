package com.apsoftware.insomniacgoat.model.database.dao

import androidx.room.*
import com.apsoftware.insomniacgoat.model.database.entity.Player

/**
 * Created by Anthony.Porter on 2019-05-19.
 */
@Suppress("unused")
@Dao
interface PlayerDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(player: Player)

    @Query("SELECT * FROM player WHERE id = :id")
    fun getPlayerById(id: Int): Player

    @Delete
    fun delete(vararg player: Player): Int

}