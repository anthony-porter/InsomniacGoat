package com.apsoftware.insomniacgoat.providers

import android.content.Context
import android.net.ConnectivityManager

/**
 * Created by Anthony.Porter on 2019-05-26.
 */
class NetworkStatusProviderImpl(private val context: Context): NetworkStatusProvider {
    override fun isOnline(): Boolean {
        val connectivityManager = context.applicationContext.getSystemService(Context.CONNECTIVITY_SERVICE)
                as ConnectivityManager
        return connectivityManager.activeNetworkInfo.isConnected
    }
}