package com.apsoftware.insomniacgoat.abstraction_layer.viewmodel

import android.app.Application
import android.view.View.GONE
import android.view.View.VISIBLE
import androidx.databinding.ObservableField
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.apsoftware.insomniacgoat.model.StatLine
import com.apsoftware.insomniacgoat.abstraction_layer.repository.PlayerStatsRepository
import io.reactivex.Observer
import io.reactivex.disposables.Disposable
import io.reactivex.internal.disposables.DisposableHelper.dispose

class StatsViewModel(application: Application) : AndroidViewModel(application) {
    var playerStatsRepository: PlayerStatsRepository = PlayerStatsRepository(getApplication())
    val isLoading = ObservableField<Int>(GONE)
    val statList = MutableLiveData<List<StatLine>>()

    lateinit var disposable: Disposable

    fun loadStats() {
        isLoading.set(VISIBLE)
        playerStatsRepository.getPlayerData(object : PlayerStatsRepository.OnRepositoryReadyCallback {
            override fun onRepositoryReady(data: List<StatLine>) {
                isLoading.set(GONE)
                statList.value = data
            }
        })
    }

    fun loadStatsViaRxJava() {
        playerStatsRepository.getPlayerData().subscribe(object: Observer<List<StatLine>> {
            /**
             * Notifies the Observer that the [Observable] has finished sending push-based notifications.
             *
             *
             * The [Observable] will not call this method if it calls [.onError].
             */
            override fun onComplete() {
                isLoading.set(GONE)
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            /**
             * Provides the Observer with the means of cancelling (disposing) the
             * connection (channel) with the Observable in both
             * synchronous (from within [.onNext]) and asynchronous manner.
             * @param d the Disposable instance whose [Disposable.dispose] can
             * be called anytime to cancel the connection
             * @since 2.0
             */
            override fun onSubscribe(d: Disposable) {
                isLoading.set(VISIBLE)
                disposable = d
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            /**
             * Provides the Observer with a new item to observe.
             *
             *
             * The [Observable] may call this method 0 or more times.
             *
             *
             * The `Observable` will not call this method again after it calls either [.onComplete] or
             * [.onError].
             *
             * @param t
             * the item emitted by the Observable
             */
            override fun onNext(t: List<StatLine>) {
                isLoading.set(VISIBLE)
                statList.value = t
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            /**
             * Notifies the Observer that the [Observable] has experienced an error condition.
             *
             *
             * If the [Observable] calls this method, it will not thereafter call [.onNext] or
             * [.onComplete].
             *
             * @param e
             * the exception encountered by the Observable
             */
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
        if (::disposable.isInitialized && !disposable.isDisposed) {
            disposable.dispose()
        }
    }
}