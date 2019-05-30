package com.apsoftware.insomniacgoat.model.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.apsoftware.insomniacgoat.model.database.dao.GoatAttributeSetDao
import com.apsoftware.insomniacgoat.model.database.dao.PlayerDao
import com.apsoftware.insomniacgoat.model.database.dao.PlayerSeasonStatLineDao
import com.apsoftware.insomniacgoat.model.database.entity.GoatAttributeSet
import com.apsoftware.insomniacgoat.model.database.entity.Player
import com.apsoftware.insomniacgoat.model.database.entity.PlayerSeasonStatLine

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
        private val LOCK = Any()

        operator fun invoke(context: Context) = instance ?: synchronized(LOCK) {
            instance ?: buildDatabase(context).also { instance = it }
        }

        private fun buildDatabase(context: Context) =
            Room.databaseBuilder(
                context.applicationContext,
                StatsDatabase::class.java, "StatsDatabase.db"
            )
                .build()
    }
}
