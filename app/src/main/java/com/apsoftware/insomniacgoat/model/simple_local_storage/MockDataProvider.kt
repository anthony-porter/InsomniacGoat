package com.apsoftware.insomniacgoat.model.simple_local_storage

import android.os.Handler
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.apsoftware.insomniacgoat.model.DataReadyCallback
import com.apsoftware.insomniacgoat.model.StatDataProvider
import com.apsoftware.insomniacgoat.model.database.entity.Player
import com.apsoftware.insomniacgoat.model.database.entity.PlayerSeasonStatLine
import java.util.*
import kotlin.random.Random

@Suppress("unused", "UNUSED_VARIABLE")
class MockDataProvider : StatDataProvider {

    override fun getStats(dataReadyCallback: DataReadyCallback) {
        Handler().postDelayed({ dataReadyCallback.onDataReady(setupMockStatList()) }, 1500)
    }

    fun getStats(): LiveData<List<PlayerSeasonStatLine>> {
        return MutableLiveData() //Observable.just(setupMockStatList()).delay(2, TimeUnit.SECONDS)
    }

    private fun setupMockStatList(): List<PlayerSeasonStatLine> {
        var playerStats: ArrayList<Player> = ArrayList()
        var rand = Random(Calendar.getInstance().timeInMillis)
        var players = arrayOf(
            arrayOf("LeBron", "James"),
            arrayOf("Michael", "Jordan"),
            arrayOf("Kobe", "Bryant"),
            arrayOf("Kareem", "Abdul-Jabaar"),
            arrayOf("Wilt", "Chamberlein"),
            arrayOf("Oscar", "Robertson"),
            arrayOf("Magic", "Johnson"),
            arrayOf("Shaquile", "O'Neal"),
            arrayOf("Tim", "Dunkcan"),
            arrayOf("Larry", "Bird"),
            arrayOf("Jerry", "West"),
            arrayOf("Charles", "Barkley"),
            arrayOf("Elgin", "Baylor"),
            arrayOf("Reggie", "Miller"),
            arrayOf("Kevin", "Durant"),
            arrayOf("Stephan", "Curry"),
            arrayOf("Dirk", "Nowitzki"),
            arrayOf("John", "Stockton"),
            arrayOf("Karl", "Malone"),
            arrayOf("Kevin", "Garnett"),
            arrayOf("Dwyane", "Wade"),
            arrayOf("Scottie", "Pippen"),
            arrayOf("Julius", "Erving"),
            arrayOf("David", "Robinson"),
            arrayOf("Tim", "Duncan"),
            arrayOf("Hakeem", "Olajuwon"),
            arrayOf("Bill", "Russell"),
            arrayOf("Allen", "Iverson"),
            arrayOf("Russel", "Westbrook"),
            arrayOf("Chris", "Paul")
        )

        return ArrayList()
    }
}