package com.apsoftware.insomniacgoat.providers

/**
 * Created by Anthony.Porter on 2019-05-26.
 */
interface NetworkStatusProvider {

    /**
     * Current internet connectivity state
     * @return current internet connectivity state
     */
    fun isOnline(): Boolean
}