package com.apsoftware.insomniacgoat.model.database.dao

import androidx.room.*
import com.apsoftware.insomniacgoat.model.database.entity.GoatAttributeSet

/**
 * Created by Anthony.Porter on 2019-05-19.
 */
@Suppress("unused")
@Dao
interface GoatAttributeSetDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(goatAttributeSet: GoatAttributeSet)

    @Query("SELECT * FROM goatAttributeSet WHERE id = :id")
    fun getGoatAttributeSet(id: Int): GoatAttributeSet
}