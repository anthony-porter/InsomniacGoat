package com.apsoftware.insomniacgoat.model.database.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.BufferedReader
import com.apsoftware.insomniacgoat.model.database.entity.PlayerSeasonStatLine
import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.Moshi
import com.squareup.moshi.Types
import java.lang.reflect.Type
import kotlin.collections.ArrayList

/**
 * Created by Anthony.Porter on 2019-06-01.
 */
@Entity
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
    val min: Int,
    val oreb: Int,
    val pf: Int,
    val pts: Int,
    val reb: Int,
    val stl: Int,
    val team: Team,
    val turnover: Int
)

@Suppress("unused")
data class PlayerGameStatLineMetaData(
    var current_page: Int,
    var next_page: Int,
    var per_page: Int,
    val total_count: Int,
    val total_pages: Int
)