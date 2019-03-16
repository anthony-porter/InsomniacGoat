package com.apsoftware.insomniacgoat.model

import com.apsoftware.insomniacgoat.viewmodel.repository.PlayerStatsRepository

interface StatDataProviderCallback {
    fun getStats(dataReadyCallback: DataReadyCallback)
}