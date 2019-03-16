package com.apsoftware.insomniacgoat.model

interface StatDataProviderCallback {
    fun getStats(dataReadyCallback: DataReadyCallback)
}