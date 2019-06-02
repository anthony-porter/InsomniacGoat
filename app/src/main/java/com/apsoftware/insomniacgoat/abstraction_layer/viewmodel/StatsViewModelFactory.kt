package com.apsoftware.insomniacgoat.abstraction_layer.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.apsoftware.insomniacgoat.abstraction_layer.repository.PlayerStatsRepository

/**
 * Created by Anthony.Porter on 2019-05-26.
 */
@Suppress("unused")
class StatsViewModelFactory(private var playerStatsRepository: PlayerStatsRepository) : ViewModelProvider.NewInstanceFactory() {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return StatsViewModel(playerStatsRepository) as T
    }
}