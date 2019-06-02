package com.apsoftware.insomniacgoat.abstraction_layer.repository

import androidx.lifecycle.LiveData
import com.apsoftware.insomniacgoat.model.database.entity.Player
import com.apsoftware.insomniacgoat.model.database.entity.PlayerSeasonStatLine

/**
 * Created by Anthony.Porter on 2019-05-26.
 */
interface PlayerStatsRepository {

    suspend fun getStats(playerId: Int): LiveData<List<PlayerSeasonStatLine>>

    suspend fun getTopScoredPlayers(): LiveData<List<Player>>

    suspend fun getPlayers(): LiveData<List<Player>>

    suspend fun addPlayer(player: Player)

    suspend fun updateData(data: List<PlayerSeasonStatLine>)


    suspend fun updateData(playerSeasonStatLine: PlayerSeasonStatLine)

}