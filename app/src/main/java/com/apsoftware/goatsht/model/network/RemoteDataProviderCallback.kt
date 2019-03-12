package com.apsoftware.insomniacgoat.model.network

import android.os.Handler
import com.apsoftware.insomniacgoat.model.DataReadyCallback
import com.apsoftware.insomniacgoat.model.StatDataProviderCallback
import com.apsoftware.insomniacgoat.model.StatLine
import com.apsoftware.insomniacgoat.viewmodel.repository.PlayerStatsRepository
import io.reactivex.Observable
import kotlin.random.Random

class RemoteDataProviderCallback: StatDataProviderCallback {
    override fun getStats(dataReadyCallback: DataReadyCallback) {
        Handler().postDelayed({dataReadyCallback.onDataReady(makeRetroFitCall())}, 1500)
    }

    fun makeRetroFitCall(): List<StatLine> {
        return ArrayList()
    }
}