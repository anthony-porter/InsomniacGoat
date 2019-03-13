package com.apsoftware.insomniacgoat.model.database

import com.apsoftware.insomniacgoat.model.DataReadyCallback
import com.apsoftware.insomniacgoat.model.StatDataProviderCallback
import com.apsoftware.insomniacgoat.model.StatLine
import com.apsoftware.insomniacgoat.viewmodel.repository.PlayerStatsRepository
import io.reactivex.Observable
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

    override fun updateData(data: List<StatLine>) {

    }
}