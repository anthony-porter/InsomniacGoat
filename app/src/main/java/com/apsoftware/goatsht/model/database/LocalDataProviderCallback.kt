package com.apsoftware.insomniacgoat.model.database

import com.apsoftware.insomniacgoat.model.DataReadyCallback
import com.apsoftware.insomniacgoat.model.StatDataProviderCallback
import com.apsoftware.insomniacgoat.model.StatLine
import com.apsoftware.insomniacgoat.viewmodel.repository.PlayerStatsRepository

class LocalDataProviderCallback: StatDataProviderCallback, StatDataPersistence {

    override fun getStats(dataReadyCallback: DataReadyCallback) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun updateData(data: List<StatLine>) {

    }
}