package com.apsoftware.insomniacgoat.model.database

import com.apsoftware.insomniacgoat.model.DataReadyCallback
import com.apsoftware.insomniacgoat.model.StatDataProvider
import com.apsoftware.insomniacgoat.model.StatLine
import io.reactivex.Completable
import io.reactivex.Observable
import io.reactivex.Single
import java.util.concurrent.TimeUnit

class LocalDataProvider: StatDataProvider {

    override fun getStats(dataReadyCallback: DataReadyCallback) {
    }


    fun getStats(): Observable<List<StatLine>> {
        return Observable.just(retrieveDataViaRoomDb()).delay(2, TimeUnit.SECONDS)
    }

    fun getTopScoredPlayers(): Observable<List<StatLine>> {
        return Observable.just(retrieveDataViaRoomDb()).delay(2, TimeUnit.SECONDS)
    }

    fun retrieveDataViaRoomDb(): List<StatLine> {
        return ArrayList<StatLine>()
    }

    fun updateData(data: List<StatLine>): Completable {
        return Single.just(1).delay(1, TimeUnit.SECONDS).ignoreElement()
    }
}