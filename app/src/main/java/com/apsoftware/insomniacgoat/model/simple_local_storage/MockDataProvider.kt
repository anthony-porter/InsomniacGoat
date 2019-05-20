package com.apsoftware.insomniacgoat.model.simple_local_storage

import android.os.Handler
import com.apsoftware.insomniacgoat.model.DataReadyCallback
import com.apsoftware.insomniacgoat.model.StatDataProvider
import com.apsoftware.insomniacgoat.model.database.entity.Player
import io.reactivex.Observable
import java.util.*
import java.util.concurrent.TimeUnit
import kotlin.random.Random

class MockDataProvider : StatDataProvider {

    override fun getStats(dataReadyCallback: DataReadyCallback) {
        Handler().postDelayed({ dataReadyCallback.onDataReady(setupMockStatList()) }, 1500)
    }

    fun getStats(): Observable<List<Player>> {
        return Observable.just(setupMockStatList()).delay(2, TimeUnit.SECONDS)
    }

    fun setupMockStatList(): List<Player> {
        val playerStats: ArrayList<Player> = ArrayList()
        val rand = Random(Calendar.getInstance().timeInMillis)
        val players = arrayOf(
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

        for (i in players.indices) {
            playerStats.add(
                Player(
                    i + 1, players[i][0], players[i][1], 2010, 2019, i + 1,
                    String.format("%.2f", rand.nextDouble(20.0, 55.0)).toDouble(),
                    String.format("%.2f", rand.nextDouble(2.5, 33.0)).toDouble(),
                    String.format("%.2f", rand.nextDouble(2.5, 17.5)).toDouble()
                )
            )
        }
        return playerStats
    }
}