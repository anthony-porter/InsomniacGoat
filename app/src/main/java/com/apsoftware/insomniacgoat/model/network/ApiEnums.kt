package com.apsoftware.insomniacgoat.model.network

import androidx.annotation.StringDef
import com.apsoftware.insomniacgoat.model.network.LeagueType.Companion.ABA
import com.apsoftware.insomniacgoat.model.network.LeagueType.Companion.NBA
import com.apsoftware.insomniacgoat.model.network.PerMode.Companion.PER_36
import com.apsoftware.insomniacgoat.model.network.PerMode.Companion.PER_GAME
import com.apsoftware.insomniacgoat.model.network.PerMode.Companion.TOTALS
import com.apsoftware.insomniacgoat.model.network.Scopes.Companion.ROOKIES
import com.apsoftware.insomniacgoat.model.network.Scopes.Companion.RS
import com.apsoftware.insomniacgoat.model.network.Scopes.Companion.S
import com.apsoftware.insomniacgoat.model.network.SeasonType.Companion.ALL_STAR
import com.apsoftware.insomniacgoat.model.network.SeasonType.Companion.PLAYOFFS
import com.apsoftware.insomniacgoat.model.network.SeasonType.Companion.PRE_SEASON
import com.apsoftware.insomniacgoat.model.network.SeasonType.Companion.REGULAR_SEASON

/**
 * Annotation classes for holding API constants
 * Created by Anthony.Porter on 2019-05-14.
 */

@Retention(AnnotationRetention.SOURCE)
@StringDef(NBA, ABA)
annotation class LeagueType {
    companion object {
        const val NBA = "00"
        const val ABA = "01"
    }
}

@Retention(AnnotationRetention.SOURCE)
@StringDef(REGULAR_SEASON, PRE_SEASON, PLAYOFFS, ALL_STAR)
annotation class SeasonType {
    companion object {
        const val REGULAR_SEASON = "Regular Season"
        const val PRE_SEASON = "Pre Season"
        const val PLAYOFFS = "Playoffs"
        const val ALL_STAR = " All Star"
    }
}

@Retention(AnnotationRetention.SOURCE)
@StringDef(TOTALS, PER_GAME, PER_36)
annotation class PerMode {
    companion object {
        const val TOTALS = "Totals"
        const val PER_GAME = "PerGame"
        const val PER_36 = "Per36"
    }
}

@Retention(AnnotationRetention.SOURCE)
@StringDef(RS, S, ROOKIES)
annotation class Scopes {
    companion object {
        const val RS = "RS"
        const val S = "S"
        const val ROOKIES = "Rookies"
    }
}