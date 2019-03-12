package com.apsoftware.insomniacgoat.model.database

import com.apsoftware.insomniacgoat.model.StatLine

interface StatDataPersistence {
    fun updateData(data: List<StatLine>)
}