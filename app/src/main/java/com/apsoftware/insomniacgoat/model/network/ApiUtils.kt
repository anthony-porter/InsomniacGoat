package com.apsoftware.insomniacgoat.model.network

/**
 * Created by Anthony.Porter on 2019-05-16.
 */

/**
 * Format the years a season was played in
 *
 *
 * @param endYear   year the season ended in
 * @return          formatted year String for the season.
 */
@Suppress("unused")
fun formatSeasonYears(endYear: Int): String {
    return String.format("%d-%d", endYear - 1, endYear % 100)
}