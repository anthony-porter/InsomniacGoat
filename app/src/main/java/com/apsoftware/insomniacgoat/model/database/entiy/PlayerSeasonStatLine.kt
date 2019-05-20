package com.apsoftware.insomniacgoat.model.database.entiy

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
    @PrimaryKey(autoGenerate = true) val ID: Int,
    @ColumnInfo(name = "player_id") val playerId: Int,
    @ColumnInfo(name = "games_played") var GP: Int,
    @ColumnInfo(name = "minutes") var MINUTES: Double,
    @ColumnInfo(name = "field_goals_made") var FGM: Double,
    @ColumnInfo(name = "field_goals_attempted") var FGA: Double,
    @ColumnInfo(name = "field_goal_percentage") var FG_PCT: Double,
    @ColumnInfo(name = "three_pointers_made") var FG3M: Double,
    @ColumnInfo(name = "three_pointers_attempted") var FG3A: Double,
    @ColumnInfo(name = "three_point_field_goal_percentage") var FG3_PCT: Double,
    @ColumnInfo(name = "offensive_rebounds") var OREB: Double,
    @ColumnInfo(name = "defensive_rebounds") var DREB: Double,
    @ColumnInfo(name = "rebounds") var REB: Double,
    @ColumnInfo(name = "assists") var AST: Double,
    @ColumnInfo(name = "steals") var STL: Double,
    @ColumnInfo(name = "blocks") var BLK: Double,
    @ColumnInfo(name = "turnovers") var TOV: Double,
    @ColumnInfo(name = "personal_fouls") var PF: Double,
    @ColumnInfo(name = "points") var PTS: Double,
    @ColumnInfo(name = "efficiency") var EFF: Double,
    @ColumnInfo(name = "assist_turnover_ratio") var AST_TOV: Double,
    @ColumnInfo(name = "steal_turnover_ratio") var STL_TOV: Double,
    @ColumnInfo(name = "freethrows_made") var FTM: Double,
    @ColumnInfo(name = "freethrows_attempted") var FTA: Double,
    @ColumnInfo(name = "freethrow_percentage") var FT_PCT: Double,
    @ColumnInfo(name = "technical_fouls") var TF: Double
)