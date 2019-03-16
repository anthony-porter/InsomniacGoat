package com.apsoftware.insomniacgoat.model.database

import com.apsoftware.insomniacgoat.model.StatLine
import io.reactivex.Completable

interface StatDataPersistence {
    fun updateData(data: List<StatLine>): Completable
}