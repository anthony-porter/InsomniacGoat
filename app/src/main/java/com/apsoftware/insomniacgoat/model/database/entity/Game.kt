package com.apsoftware.insomniacgoat.model.database.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * Created by Anthony.Porter on 2019-06-01.
 */


@Entity
data class Game(
    @PrimaryKey(autoGenerate = false) val id: Int,
    val date: String,
    val home_team_id: Int,
    var home_team_score: Int,
    val season: Int,
    val visitor_team_id: Int,
    var visitor_team_score: Int
)