package com.apsoftware.insomniacgoat.model.simple_local_storage

import com.apsoftware.insomniacgoat.model.StatDataProvider
import com.apsoftware.insomniacgoat.model.StatLine
import java.util.*
import android.os.Handler
import com.apsoftware.insomniacgoat.model.DataReadyCallback
import io.reactivex.Observable
import java.util.concurrent.TimeUnit
import kotlin.random.Random

class MockDataProvider: StatDataProvider {

    override fun getStats(dataReadyCallback: DataReadyCallback){
        Handler().postDelayed({dataReadyCallback.onDataReady(setupMockStatList())}, 1500)
    }

    fun getStats(): Observable<List<StatLine>> {
        return Observable.just(setupMockStatList()).delay(2, TimeUnit.SECONDS)
    }

    fun setupMockStatList(): List<StatLine> {
        val playerStats: ArrayList<StatLine> = ArrayList()
        val rand = Random(Calendar.getInstance().timeInMillis)
        val players = arrayOf(
            "LeBron James",
            "Michael Jordan",
            "Kobe Bryant",
            "Kareem Abdul-Jabaar",
            "Wilt Chamberlein",
            "Oscar Robertson",
            "Magic Johnson",
            "Shaquile O'Neal",
            "Tim Dunkcan",
            "Larry Bird",
            "Jerry West",
            "Charles Barkley",
            "Elgin Baylor",
            "Reggie Miller",
            "Kevin Durant",
            "Stephan Curry",
            "Dirk Nowitzki",
            "John Stockton",
            "Karl Malone",
            "Kevin Garnett",
            "Dwyane Wade",
            "Scottie Pippen",
            "Julius Erving",
            "David Robinson",
            "Tim Duncan",
            "Hakeem Olajuwon",
            "Bill Russell",
            "Allen Iverson",
            "Russel Westbrook",
            "Chris Paul"
        )

        for (i in players.indices) {
            playerStats.add(
                StatLine(
                    i + 1, players[i],
                    String.format("%.2f", rand.nextDouble(20.0, 55.0)).toDouble(),
                    String.format("%.2f", rand.nextDouble(2.5, 33.0)).toDouble(),
                    String.format("%.2f", rand.nextDouble(2.5, 17.5)).toDouble()
                )
            )
        }
        return playerStats
    }
}