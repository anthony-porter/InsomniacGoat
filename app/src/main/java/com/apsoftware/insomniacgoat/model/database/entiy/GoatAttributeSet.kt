package com.apsoftware.insomniacgoat.model.database.entiy

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Created by Anthony.Porter on 2019-05-19.
 */
@Entity
data class GoatAttributeSet(
    @PrimaryKey val id: Int,
    @ColumnInfo(name = "attribute_name") val attributeName: String,
    var value: Int,
    var weight: Double
)