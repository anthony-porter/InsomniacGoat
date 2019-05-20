package com.apsoftware.insomniacgoat.model.database

import com.apsoftware.insomniacgoat.model.DataReadyCallback
import com.apsoftware.insomniacgoat.model.StatDataProvider
import com.apsoftware.insomniacgoat.model.database.entity.Player
import com.apsoftware.insomniacgoat.model.database.entity.PlayerSeasonStatLine
import io.reactivex.Completable
import io.reactivex.Observable
import io.reactivex.Single
import java.util.concurrent.TimeUnit

class LocalDataProvider : StatDataProvider {

    override fun getStats(dataReadyCallback: DataReadyCallback) {
    }


    fun getStats(): Observable<List<Player>> {
        return Observable.just(retrieveDataViaRoomDb()).delay(2, TimeUnit.SECONDS)
    }

    fun getTopScoredPlayers(): Observable<List<Player>> {
        return Observable.just(retrieveDataViaRoomDb()).delay(2, TimeUnit.SECONDS)
    }

    fun retrieveDataViaRoomDb(): List<Player> {
        return ArrayList<Player>()
    }

    fun updateData(data: List<PlayerSeasonStatLine>): Completable {
        return Single.just(1).delay(1, TimeUnit.SECONDS).ignoreElement()
    }

    fun getPlayers(): Observable<List<Player>> {
        return Observable.just(retrieveDataViaRoomDb()).delay(2, TimeUnit.SECONDS)
    }
}