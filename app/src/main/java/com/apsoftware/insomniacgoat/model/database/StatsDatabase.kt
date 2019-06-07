package com.apsoftware.insomniacgoat.model.database

import android.content.Context
import androidx.room.Database
import androidx.room.Insert
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import com.apsoftware.insomniacgoat.model.database.dao.GoatAttributeSetDao
import com.apsoftware.insomniacgoat.model.database.dao.PlayerDao
import com.apsoftware.insomniacgoat.model.database.dao.PlayerSeasonStatLineDao
import com.apsoftware.insomniacgoat.model.database.entity.GoatAttributeSet
import com.apsoftware.insomniacgoat.model.database.entity.Player
import com.apsoftware.insomniacgoat.model.database.entity.PlayerSeasonStatLine
import kotlinx.coroutines.runBlocking
import android.graphics.Movie
import android.os.AsyncTask
import androidx.annotation.NonNull



/**
 * Created by Anthony.Porter on 2019-05-19.
 */
@Database(
    entities = [Player::class, PlayerSeasonStatLine::class, GoatAttributeSet::class],
    version = 1
)
abstract class StatsDatabase : RoomDatabase() {
    abstract fun playerDao(): PlayerDao
    abstract fun playerSeasonStatLineDao(): PlayerSeasonStatLineDao
    abstract fun goatAttributeSetDao(): GoatAttributeSetDao

    companion object {
        @Volatile
        private var instance: StatsDatabase? = null
        private var LOCK = Any()

        operator fun invoke(context: Context) = instance ?: synchronized(LOCK) {
            runBlocking { buildDatabase(context).also { instance = it } }
        }

        private fun buildDatabase(context: Context): StatsDatabase =
            Room.databaseBuilder(
                context.applicationContext,
                StatsDatabase::class.java, "StatsDatabase.db"
            )
                .addCallback(object : Callback() {
                    override fun onCreate(db: SupportSQLiteDatabase) {
                        super.onCreate(db)
                        instance?.playerDao()?.insert(Player.getDataFromCsv())
                        instance?.playerSeasonStatLineDao()?.insert(PlayerSeasonStatLine.getDataFromCsv())
                    }
                }
                )
                .build()
    }

}
