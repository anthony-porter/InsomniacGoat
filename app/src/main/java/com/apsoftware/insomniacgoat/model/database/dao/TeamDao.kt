package com.apsoftware.insomniacgoat.model.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.apsoftware.insomniacgoat.model.database.entity.Team

/**
 * Created by Anthony.Porter on 2019-06-02.
 */
@Suppress("unused")
@Dao
interface TeamDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(team: Team)

    @Query("")
    fun getTeam(teamId: Int)

    @Query("")
    fun getTeam(name: String)


}