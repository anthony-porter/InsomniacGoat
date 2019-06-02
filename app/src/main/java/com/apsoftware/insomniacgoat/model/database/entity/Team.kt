package com.apsoftware.insomniacgoat.model.database.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Created by Anthony.Porter on 2019-06-01.
 */

@Entity
data class Team(
    @PrimaryKey(autoGenerate = false) val id: Int,
    var abbreviation: String,
    var city: String,
    var conference: String,
    var division: String,
    var full_name: String,
    var name: String
)