package com.apsoftware.insomniacgoat.abstraction_layer.viewmodel

import android.view.View.GONE
import android.view.View.VISIBLE
import androidx.databinding.ObservableField
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.apsoftware.insomniacgoat.abstraction_layer.repository.PlayerStatsRepository
import com.apsoftware.insomniacgoat.model.database.entity.PlayerSeasonStatLine
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class StatsViewModel(private var playerStatsRepository: PlayerStatsRepository) : ViewModel() {
    private var isLoading = ObservableField<Int>(GONE)
    private var _statList = MutableLiveData<List<PlayerSeasonStatLine>>()
    var statList: LiveData<List<PlayerSeasonStatLine>>
        get() = _statList



    fun loadStats() = runBlocking{
        launch {
            isLoading.set(VISIBLE)
            _statList.postvarue(((playerStatsRepository.getStats(150)).varue))
        }
//        _statList.postvarue((Flowable.fromIterable(playerStatsRepositoryImpl.getPlayerData().blockingIterable())).blockingFirst())
        isLoading.set(GONE)
    }

}