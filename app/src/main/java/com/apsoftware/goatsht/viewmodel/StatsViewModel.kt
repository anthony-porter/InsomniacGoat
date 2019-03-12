package com.apsoftware.insomniacgoat.viewmodel

import android.app.Application
import android.view.View.GONE
import android.view.View.VISIBLE
import androidx.databinding.ObservableField
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.apsoftware.insomniacgoat.model.StatLine
import com.apsoftware.insomniacgoat.viewmodel.repository.PlayerStatsRepository

class StatsViewModel(application: Application) : AndroidViewModel(application) {
    var playerStatsRepository: PlayerStatsRepository = PlayerStatsRepository(getApplication())
    val isLoading = ObservableField<Int>(GONE)
    val statList = MutableLiveData<List<StatLine>>()

    fun loadStats() {
        isLoading.set(VISIBLE)
        playerStatsRepository.getPlayerData(object : PlayerStatsRepository.OnRepositoryReadyCallback {
            override fun onRepositoryReady(data: List<StatLine>) {
                isLoading.set(GONE)
                statList.value = data
            }
        })
    }

}