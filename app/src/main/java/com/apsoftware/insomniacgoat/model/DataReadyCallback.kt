package com.apsoftware.insomniacgoat.model

interface DataReadyCallback {
    fun onDataReady(data: List<StatLine>)
}