package com.apsoftware.insomniacgoat.model.database.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey


/**
 * Created by Anthony.Porter on 2019-05-19.
 */
@Entity(
    foreignKeys = [ForeignKey(
        entity = Player::class,
        parentColumns = arrayOf("id"),
        childColumns = arrayOf("player_id"),
        onDelete = ForeignKey.CASCADE
    )]
)
data class PlayerSeasonStatLine(
    @PrimaryKey(autoGenerate = true) val id: Int,
    var ast: Double,
    var blk: Double,
    var dreb: Double,
    var fg3_pct: Double,
    var fg3a: Double,
    var fg3m: Double,
    var fg_pct: Double,
    var fga: Double,
    var fgm: Double,
    var ft_pct: Double,
    var fta: Double,
    var ftm: Double,
    var games_played: Int,
    var min: String,
    var oreb: Double,
    var pf: Double,
    var player_id: Int,
    var pts: Double,
    var reb: Double,
    var season: Int,
    var stl: Double,
    var turnover: Double
)