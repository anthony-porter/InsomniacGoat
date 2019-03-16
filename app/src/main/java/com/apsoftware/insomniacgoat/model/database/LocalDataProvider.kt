package com.apsoftware.insomniacgoat.model.database

import com.apsoftware.insomniacgoat.model.DataReadyCallback
import com.apsoftware.insomniacgoat.model.StatDataProviderCallback
import com.apsoftware.insomniacgoat.model.StatLine
import com.apsoftware.insomniacgoat.abstraction_layer.repository.PlayerStatsRepository
import io.reactivex.Completable
import io.reactivex.Observable
import io.reactivex.Single
import java.util.concurrent.TimeUnit

class LocalDataProvider: StatDataProviderCallback, StatDataPersistence {

    override fun getStats(dataReadyCallback: DataReadyCallback) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


    fun getStats(): Observable<List<StatLine>> {
        return Observable.just(retrieveDataViaRoomDb()).delay(2, TimeUnit.SECONDS)
    }

    fun retrieveDataViaRoomDb(): List<StatLine> {
        return ArrayList<StatLine>()
    }

    override fun updateData(data: List<StatLine>): Completable {
        return Single.just(1).delay(1, TimeUnit.SECONDS).ignoreElement()
    }
}