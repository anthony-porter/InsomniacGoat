package com.apsoftware.insomniacgoat.abstraction_layer.viewmodel

import android.app.Application
import android.view.View.GONE
import android.view.View.VISIBLE
import androidx.databinding.ObservableField
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.apsoftware.insomniacgoat.abstraction_layer.repository.PlayerStatsRepository
import com.apsoftware.insomniacgoat.extension_functions.plusAssign
import com.apsoftware.insomniacgoat.model.StatLine
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.observers.DisposableObserver
import io.reactivex.schedulers.Schedulers

class StatsViewModel(application: Application) : AndroidViewModel(application) {
    private var playerStatsRepository: PlayerStatsRepository = PlayerStatsRepository(getApplication())
    val isLoading = ObservableField<Int>(GONE)
    val statList = MutableLiveData<List<StatLine>>()

    private val compositeDisposable = CompositeDisposable()

    fun loadStats() {
        isLoading.set(VISIBLE)
//        playerStatsRepository.getPlayerData(object : PlayerStatsRepository.OnRepositoryReadyCallback {
//            override fun onRepositoryReady(data: List<StatLine>) {
//                isLoading.set(GONE)
//                statList.value = data
//            }
//        })
    }

    fun loadStatsViaRxJava() {
        isLoading.set(VISIBLE)
        compositeDisposable += playerStatsRepository.getPlayerData()
            .subscribeOn(Schedulers.newThread())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeWith(object : DisposableObserver<List<StatLine>>() {

                override fun onComplete() {
                    isLoading.set(GONE)
                    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
                }

                override fun onNext(t: List<StatLine>) {
                    isLoading.set(VISIBLE)
                    statList.value = t
                }

                override fun onError(e: Throwable) {

                }
            })
    }

    /**
     * This method will be called when this ViewModel is no longer used and will be destroyed.
     *
     *
     * It is useful when ViewModel observes some data and you need to clear this subscription to
     * prevent a leak of this ViewModel.
     */
    override fun onCleared() {
        super.onCleared()
        if (!compositeDisposable.isDisposed) {
            compositeDisposable.dispose()
        }
    }
}