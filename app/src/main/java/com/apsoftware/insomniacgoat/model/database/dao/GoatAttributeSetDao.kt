package com.apsoftware.insomniacgoat.model.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.apsoftware.insomniacgoat.model.database.entity.GoatAttributeSet

/**
 * Created by Anthony.Porter on 2019-05-19.
 */
@Dao
interface GoatAttributeSetDao {

    @Insert
    fun insert(goatAttributeSet: GoatAttributeSet)

    @Query("SELECT * FROM goatAttributeSet WHERE id = :id")
    fun getGoatAttributeSet(id: Int): GoatAttributeSet
}