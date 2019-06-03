package com.apsoftware.insomniacgoat.providers

import android.content.Context
import android.net.ConnectivityManager

/**
 * Created by Anthony.Porter on 2019-05-26.
 */
@Suppress("unused")
class NetworkStatusProviderImpl(private var context: Context): NetworkStatusProvider {

    /**
     * Gets the current connectivity
     * @return current internet connectivity state
     */
    override fun isOnline(): Boolean {
        val connectivityManager = context.applicationContext.getSystemService(Context.CONNECTIVITY_SERVICE)
                as ConnectivityManager
        return connectivityManager.activeNetworkInfo.isConnected
    }
}