package com.apsoftware.insomniacgoat.model

import com.apsoftware.insomniacgoat.model.database.entity.PlayerSeasonStatLine

interface DataReadyCallback {
    fun onDataReady(data: List<PlayerSeasonStatLine>)
}