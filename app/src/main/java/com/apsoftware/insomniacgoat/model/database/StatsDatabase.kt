package com.apsoftware.insomniacgoat.model.database

import androidx.room.Database
import androidx.room.DatabaseConfiguration
import androidx.room.InvalidationTracker
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteOpenHelper
import com.apsoftware.insomniacgoat.model.database.dao.GoatAttributeSetDao
import com.apsoftware.insomniacgoat.model.database.dao.PlayerDao
import com.apsoftware.insomniacgoat.model.database.dao.PlayerSeasonStatLineDao
import com.apsoftware.insomniacgoat.model.database.entiy.GoatAttributeSet
import com.apsoftware.insomniacgoat.model.database.entiy.Player
import com.apsoftware.insomniacgoat.model.database.entiy.PlayerSeasonStatLine

/**
 * Created by Anthony.Porter on 2019-05-19.
 */
@Database(
    entities = arrayOf(
        Player::class,
        PlayerSeasonStatLine::class,
        GoatAttributeSet::class
    ),
    version = 1
)
abstract class StatsDatabase : RoomDatabase() {
    abstract fun playerDao(): PlayerDao
    abstract fun playerSeasonStatLineDao(): PlayerSeasonStatLineDao
    abstract fun goatAttributeSetDao(): GoatAttributeSetDao

    }
