package com.apsoftware.insomniacgoat.providers

/**
 * Created by Anthony.Porter on 2019-05-26.
 */
interface NetworkStatusProvider {
    fun isOnline(): Boolean
}