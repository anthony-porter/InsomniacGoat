package com.apsoftware.insomniacgoat

import android.app.Application
import androidx.room.Room
import com.apsoftware.insomniacgoat.model.database.StatsDatabase
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import org.kodein.di.android.x.androidXModule
import org.kodein.di.generic.bind
import org.kodein.di.generic.instance
import org.kodein.di.generic.singleton

/**
 * Created by Anthony.Porter on 2019-05-19.
 */
@Suppress("unused")
class InsomniacGoatApplication : Application(), KodeinAware {
    override val kodein = Kodein.lazy {
        import(androidXModule(this@InsomniacGoatApplication))
        bind() from singleton {StatsDatabase(instance())}
        bind() from singleton {instance<StatsDatabase>().playerDao()}
        bind() from singleton {instance<StatsDatabase>().playerSeasonStatLineDao()}
    }

    override fun onCreate() {
        super.onCreate()
    }
}