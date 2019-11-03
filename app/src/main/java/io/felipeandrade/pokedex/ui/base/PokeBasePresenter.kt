package io.felipeandrade.pokedex.ui.base

import android.os.Handler
import android.os.Looper

abstract class PokeBasePresenter(
    private var view: PokeBaseView?
) {

    fun onDestroy() {

    }

    fun onCreate() {
        view = null
    }

    protected fun runOnView(callback: (PokeBaseView) -> Unit) {
        Handler(Looper.getMainLooper()).post {
            view?.let { callback.invoke(it) }
        }
    }

}
