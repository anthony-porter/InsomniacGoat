package com.apsoftware.insomniacgoat.model

import com.apsoftware.insomniacgoat.model.database.entity.Player

interface DataReadyCallback {
    fun onDataReady(data: List<Player>)
}