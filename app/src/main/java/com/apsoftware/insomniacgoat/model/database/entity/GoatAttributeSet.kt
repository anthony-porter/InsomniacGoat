package com.apsoftware.insomniacgoat.model.database.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Created by Anthony.Porter on 2019-05-19.
 */
@Entity
data class GoatAttributeSet(
    @PrimaryKey(autoGenerate = true) var id: Int,
    var attibute_name: String,
    var varue: Int,
    var weight: Double
)