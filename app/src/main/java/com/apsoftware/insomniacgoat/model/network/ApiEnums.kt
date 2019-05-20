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
import com.apsoftware.insomniacgoat.model.network.StatCategories.Companion.AST
import com.apsoftware.insomniacgoat.model.network.StatCategories.Companion.AST_TOV
import com.apsoftware.insomniacgoat.model.network.StatCategories.Companion.BLK
import com.apsoftware.insomniacgoat.model.network.StatCategories.Companion.DREB
import com.apsoftware.insomniacgoat.model.network.StatCategories.Companion.EFF
import com.apsoftware.insomniacgoat.model.network.StatCategories.Companion.FG3A
import com.apsoftware.insomniacgoat.model.network.StatCategories.Companion.FG3M
import com.apsoftware.insomniacgoat.model.network.StatCategories.Companion.FG3_PCT
import com.apsoftware.insomniacgoat.model.network.StatCategories.Companion.FGA
import com.apsoftware.insomniacgoat.model.network.StatCategories.Companion.FGM
import com.apsoftware.insomniacgoat.model.network.StatCategories.Companion.FG_PCT
import com.apsoftware.insomniacgoat.model.network.StatCategories.Companion.FTA
import com.apsoftware.insomniacgoat.model.network.StatCategories.Companion.FTM
import com.apsoftware.insomniacgoat.model.network.StatCategories.Companion.FT_PCT
import com.apsoftware.insomniacgoat.model.network.StatCategories.Companion.GP
import com.apsoftware.insomniacgoat.model.network.StatCategories.Companion.MINUTES
import com.apsoftware.insomniacgoat.model.network.StatCategories.Companion.OREB
import com.apsoftware.insomniacgoat.model.network.StatCategories.Companion.PF
import com.apsoftware.insomniacgoat.model.network.StatCategories.Companion.PTS
import com.apsoftware.insomniacgoat.model.network.StatCategories.Companion.REB
import com.apsoftware.insomniacgoat.model.network.StatCategories.Companion.STL
import com.apsoftware.insomniacgoat.model.network.StatCategories.Companion.STL_TOV
import com.apsoftware.insomniacgoat.model.network.StatCategories.Companion.TOV

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
@Retention(AnnotationRetention.SOURCE)
@StringDef(GP, MINUTES, FGM, FGA, FG_PCT, FG3M, FG3A, FG3_PCT, OREB, DREB, REB, AST, STL, BLK, TOV, PF, PTS, EFF, AST_TOV,
    STL_TOV, FTM, FTA, FT_PCT)
annotation class StatCategories {
    companion object {
        const val GP = "GP"
        const val MINUTES = "MIN"
        const val FGM = "FGM"
        const val FGA = "FGA"
        const val FG_PCT = "FG_PCT"
        const val FG3M = "FG3M"
        const val FG3A = "FG3A"
        const val FG3_PCT = "FG3_PCT"
        const val FTM = "FTM"
        const val FTA = "FTA"
        const val FT_PCT = "FT_PCT"
        const val OREB = "OREB"
        const val DREB = "DREB"
        const val REB = "REB"
        const val AST = "AST"
        const val STL = "STL"
        const val BLK = "BLK"
        const val TOV = "TOV"
        const val PF = "PF"
        const val PTS = "PTS"
        const val EFF = "EFF"
        const val AST_TOV = "AST_TOV"
        const val STL_TOV = "STL_TOV"
    }
}