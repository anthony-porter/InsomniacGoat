package com.apsoftware.insomniacgoat.model.network

import androidx.lifecycle.LiveData
import com.apsoftware.insomniacgoat.model.database.entity.Player
import com.apsoftware.insomniacgoat.model.database.entity.PlayerGameStatLine
import com.apsoftware.insomniacgoat.model.database.entity.PlayerSeasonStatLine
import com.apsoftware.insomniacgoat.model.database.entity.Team
import java.util.*

@Suppress("unused")
interface NbaApiDataSource {

    suspend fun getSeasonStats(playerId: Int): LiveData<List<PlayerSeasonStatLine>>

    suspend fun getSeasonStats(playerId: Int, year: Int): LiveData<PlayerSeasonStatLine>

    suspend fun getGameStats(playerId: Int, gameId: Int): LiveData<PlayerGameStatLine>

    suspend fun getGameStats(playerId: Int, date: Date): LiveData<PlayerGameStatLine>

    suspend fun getGameStats(playerId: Int, year: Int, playoffs: Boolean): LiveData<List<PlayerGameStatLine>>

    suspend fun getGameStats(playerId: Int, startDate: Date, endDate: Date): LiveData<List<PlayerGameStatLine>>

    suspend fun getTeams(): LiveData<List<Team>>

    suspend fun getPlayer(firstName: String, lastName: String): Int


}