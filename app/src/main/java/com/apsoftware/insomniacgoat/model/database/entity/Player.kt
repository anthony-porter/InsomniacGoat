package com.apsoftware.insomniacgoat.model.database.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


/**
 * Created by Anthony.Porter on 2019-05-19.
 */
@Entity
data class Player(
    @PrimaryKey val id: Int,
    @ColumnInfo(name = "first_name") var firstName: String,
    @ColumnInfo(name = "last_name") var lastName: String,
    @ColumnInfo(name = "starting_year") val startingYear: Int,
    @ColumnInfo(name = "final_year") var finalYear: Int,
    var rank: Int,
    @ColumnInfo(name = "career_ppg") var careerPpg: Double,
    @ColumnInfo(name = "career_apg") var careerApg: Double,
    @ColumnInfo(name = "career_rpg") var careerRpg: Double
)

