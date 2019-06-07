package com.apsoftware.insomniacgoat.model.database.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.Moshi
import com.squareup.moshi.Types
import java.io.BufferedReader


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
    var weight_pounds: Int?,
    val year_started: Int?,
    var seasons_played:Int?
) {

    companion object {
        fun getDataFromCsv(): List<Player> {
            val reader: BufferedReader = this::class.java.getResourceAsStream("historicalPlayers.csv")?.let { it ->
                it.bufferedReader()
                    .let { it }
            } ?: return ArrayList()
            val jsonFileAsString = reader.readText()
            val moshi = Moshi.Builder().build()
            val type = Types.newParameterizedType(List::class.java, Player::class.java)
            val jsonAdapter: JsonAdapter<List<Player>> = moshi.adapter(type)
            return jsonAdapter.fromJson(jsonFileAsString)?.let{it} ?: ArrayList()
        }
    }

}


