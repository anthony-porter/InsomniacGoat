package com.apsoftware.insomniacgoat.model.database.entity

import androidx.room.PrimaryKey

/**
 * Created by Anthony.Porter on 2019-06-01.
 */
data class PlayerGameStatLine(
    @PrimaryKey(autoGenerate = false) val id: Int,
    val game: Game,
    val player: Player,
    val ast: Int,
    val blk: Int,
    val dreb: Int,
    val fg3_pct: Double,
    val fg3a: Int,
    val fg3m: Int,
    val fg_pct: Double,
    val fga: Int,
    val fgm: Int,
    val ft_pct: Double,
    val fta: Int,
    val ftm: Int,
    val min: String,
    val oreb: Int,
    val pf: Int,
    val pts: Int,
    val reb: Int,
    val stl: Int,
    val team: Team,
    val turnover: Int
)

data class PlayerGameStatLineMetaData(
    var current_page: Int,
    var next_page: Int,
    var per_page: Int,
    val total_count: Int,
    val total_pages: Int
)