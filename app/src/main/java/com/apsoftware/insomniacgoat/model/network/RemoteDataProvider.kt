package com.apsoftware.insomniacgoat.model.network

import android.os.Handler
import com.apsoftware.insomniacgoat.model.DataReadyCallback
import com.apsoftware.insomniacgoat.model.StatDataProvider
import com.apsoftware.insomniacgoat.model.database.entity.Player
import io.reactivex.Observable
import java.util.concurrent.TimeUnit

class RemoteDataProvider : StatDataProvider {
    override fun getStats(dataReadyCallback: DataReadyCallback) {
        Handler().postDelayed({ dataReadyCallback.onDataReady(makeRetroFitCall()) }, 1500)
    }

    fun getStats(): Observable<List<Player>> {
        return Observable.just(retrieveDataViaRxJava()).delay(2, TimeUnit.SECONDS)
    }

    fun getPlayerId(firstName: String, lastName: String): Int {
        return retrievePlayerIdViaRxJava(firstName, lastName)
    }

    fun retrieveDataViaRxJava(): List<Player> {
        return ArrayList<Player>()
    }

    fun retrievePlayerIdViaRxJava(firstName: String, lastName: String): Int {
        return -1
    }

    fun makeRetroFitCall(): List<Player> {
        return ArrayList()
    }

    fun getPlayers(): Observable<List<Player>> {
        return Observable.just(retrieveDataViaRxJava()).delay(2, TimeUnit.SECONDS)
    }
}