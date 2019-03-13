package com.apsoftware.insomniacgoat.model.network

import android.os.Handler
import com.apsoftware.insomniacgoat.model.DataReadyCallback
import com.apsoftware.insomniacgoat.model.StatDataProviderCallback
import com.apsoftware.insomniacgoat.model.StatLine
import com.apsoftware.insomniacgoat.viewmodel.repository.PlayerStatsRepository
import io.reactivex.Observable
import java.util.concurrent.TimeUnit
import kotlin.random.Random

class RemoteDataProvider: StatDataProviderCallback {
    override fun getStats(dataReadyCallback: DataReadyCallback) {
        Handler().postDelayed({dataReadyCallback.onDataReady(makeRetroFitCall())}, 1500)
    }


    fun getStats(): Observable<List<StatLine>> {
        return Observable.just(retrieveDataViaRxjava()).delay(2, TimeUnit.SECONDS)
    }

    fun retrieveDataViaRxjava(): List<StatLine> {
        return ArrayList<StatLine>()
    }

    fun makeRetroFitCall(): List<StatLine> {
        return ArrayList()
    }
}