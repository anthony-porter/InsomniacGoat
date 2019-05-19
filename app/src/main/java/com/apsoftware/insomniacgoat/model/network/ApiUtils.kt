package com.apsoftware.insomniacgoat.model.network

/**
 * Created by Anthony.Porter on 2019-05-16.
 */

/**
 * Format the years a season was played in
 *
 *
 * @param endYear   year the season ended in
 * @return          formated year String for the season.
 */
fun formatSeasonYears(endYear: Int): String {
    return String.format("%d-%d", endYear - 1, endYear % 100)
}

class ApiUtils {


}