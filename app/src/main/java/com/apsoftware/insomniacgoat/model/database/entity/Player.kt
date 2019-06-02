package com.apsoftware.insomniacgoat.model.database.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


/**
 * Created by Anthony.Porter on 2019-05-19.
 */
@Entity
data class Player(
    @PrimaryKey(autoGenerate = false) var id: Int,
    var first_name: String,
    var height_feet: Int?,
    var height_inches: Int?,
    var last_name: String,
    var position: String,
    var team: Team,
    var weight_pounds: Int?
)


