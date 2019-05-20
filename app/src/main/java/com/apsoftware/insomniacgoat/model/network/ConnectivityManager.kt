package com.apsoftware.insomniacgoat.model.network

import android.annotation.SuppressLint
import android.content.Context

class ConnectivityManager(private var applicationContext: Context) {
    private var status: Boolean? = false

    val isConnectedToInternet: Boolean?
        @SuppressLint("ServiceCast")
        get() {
            val conManager = applicationContext.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
            val isConnected = conManager.isConnectedToInternet
            return isConnected?.let { it } ?: false
        }
}