package com.apsoftware.insomniacgoat.abstraction_layer.viewmodel

import android.app.Application
import android.view.View.GONE
import android.view.View.VISIBLE
import androidx.databinding.ObservableField
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.apsoftware.insomniacgoat.abstraction_layer.repository.PlayerStatsRepository
import com.apsoftware.insomniacgoat.model.database.entity.Player
import io.reactivex.disposables.CompositeDisposable

class StatsViewModel(application: Application) : AndroidViewModel(application) {
    private var playerStatsRepository: PlayerStatsRepository = PlayerStatsRepository(getApplication())
    val isLoading = ObservableField<Int>(GONE)
    private val _statList = MutableLiveData<List<Player>>()
    val statList: LiveData<List<Player>>
        get() = _statList


    private val compositeDisposable = CompositeDisposable()

    fun loadStats() {
        isLoading.set(VISIBLE)
        _statList.postValue((playerStatsRepository.getPlayerData().blockingFirst()))
//        _statList.postValue((Flowable.fromIterable(playerStatsRepository.getPlayerData().blockingIterable())).blockingFirst())
        isLoading.set(GONE)
    }

//    fun loadStatsViaRxJava() {
//        isLoading.set(VISIBLE)
//        compositeDisposable += playerStatsRepository.getPlayerData()
//            .subscribeOn(Schedulers.newThread())
//            .observeOn(AndroidSchedulers.mainThread())
//            .subscribeWith(object : DisposableObserver<List<Player>>() {
//
//                override fun onComplete() {
//                    isLoading.set(GONE)
//                    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//                }
//
//                override fun onNext(t: List<Player>) {
//                    isLoading.set(VISIBLE)
//                    statList.value = t
//                }
//
//                override fun onError(e: Throwable) {
//
//                }
//            })
//    }

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