package com.apsoftware.insomniacgoat.model

interface StatDataProvider {
    fun getStats(dataReadyCallback: DataReadyCallback)
}