package com.apsoftware.insomniacgoat

import android.app.Application
import androidx.room.Room
import com.apsoftware.insomniacgoat.model.database.StatsDatabase

/**
 * Created by Anthony.Porter on 2019-05-19.
 */
@Suppress("unused")
class InsomniacGoatApplication: Application() {

    companion object {
        lateinit var database: StatsDatabase
    }

    override fun onCreate() {
        super.onCreate()
        database = Room.databaseBuilder(this, StatsDatabase::class.java, "StatsDatabase").build()
    }
}