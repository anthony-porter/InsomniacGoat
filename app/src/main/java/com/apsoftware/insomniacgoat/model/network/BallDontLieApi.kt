package com.apsoftware.insomniacgoat.model.network

import com.apsoftware.insomniacgoat.model.database.entity.*
import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import kotlinx.coroutines.Deferred
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by Anthony.Porter on 2019-05-19.
 */

interface BallDontLieApi {

    @GET("players")
    fun getPlayer(
        @Query("ID") playerId: Int
    ): Deferred<Player>

    @GET("players")
    fun getPlayer(
        @Query("search") lastName: String,
        @Query("search") firstName: String
    ): Deferred<List<Player>>

    @GET("teams")
    fun getTeams(): Deferred<List<Team>>

    @GET("games")
    fun getGames(
        @Query("start_date") startDate: String,
        @Query("end_date") endDate: String,
        @Query("postseason") postSeason: Boolean = false,
        @Query("per_page") perPage: Int,
        @Query("team_ids") teamId: Int,
        @Query("page") page: Int
    ): Deferred<List<Game>>

    @GET("stats")
    fun getSeasonAverages(
        @Query("player_ids") playerIds: Array<Int>,
        @Query("seasons") seasons: Array<Int>,
        @Query("per_page") perPage: Int = 100,
        @Query("postseason") postSeason: Boolean = true
    ): Deferred<List<PlayerGameStatLine>>

    @GET("season_averages")
    fun getSeasonAverages(
        @Query("player_ids") playerIds: Array<Int>,
        @Query("season") season:Int
    ): Deferred<List<PlayerSeasonStatLine>>

    companion object {
        private const val BASE_URL: String = "https://www.balldontlie.io/api/v1/"
        operator fun invoke(): BallDontLieApi {
            return Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addCallAdapterFactory(CoroutineCallAdapterFactory())
                .addConverterFactory(MoshiConverterFactory.create())
                .build()
                .create(BallDontLieApi::class.java)
        }
    }

}