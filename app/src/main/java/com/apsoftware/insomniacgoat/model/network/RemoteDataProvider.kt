package com.apsoftware.insomniacgoat.model.network

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.apsoftware.insomniacgoat.model.DataReadyCallback
import com.apsoftware.insomniacgoat.model.StatDataProvider
import com.apsoftware.insomniacgoat.model.database.entity.Player

@Suppress("unused")
class RemoteDataProvider : StatDataProvider {
    override fun getStats(dataReadyCallback: DataReadyCallback) {
        //Handler().postDelayed({ dataReadyCallback.onDataReady(makeRetroFitCall()) }, 1500)
    }

    fun getStats(): LiveData<List<Player>> {
        return MutableLiveData<List<Player>>()//Observable.just(retrieveDataViaRxJava()).delay(2, TimeUnit.SECONDS)
    }

    @Suppress("UNUSED_PARAMETER")
    fun getPlayerId(firstName: String, lastName: String): Int {
        return 0//retrievePlayerIdViaRxJava(firstName, lastName)
    }

    fun retrieveDataViaRxJava(): List<Player> {
        return ArrayList()
    }

    @Suppress("UNUSED_PARAMETER")
    fun retrievePlayerIdViaRxJava(firstName: String, lastName: String): Int {
        return -1
    }

    fun makeRetroFitCall(): List<Player> {
        return ArrayList()
    }

    fun getPlayers(): LiveData<List<Player>> {
        return MutableLiveData<List<Player>>() // Observable.just(retrieveDataViaRxJava()).delay(2, TimeUnit.SECONDS)
    }
}