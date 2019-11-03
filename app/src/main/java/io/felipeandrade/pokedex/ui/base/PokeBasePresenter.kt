package io.felipeandrade.pokedex.ui.base

import android.os.Handler
import android.os.Looper
import androidx.navigation.NavController


abstract class PokeBasePresenter(
    private var view: PokeBaseView?,
    private var navController: NavController
) {

    fun onCreate() {

    }

    fun onDestroy() {
        view = null
    }

    protected fun runOnView(callback: (PokeBaseView) -> Unit) {
        Handler(Looper.getMainLooper()).post {
            view?.let { callback.invoke(it) }
        }
    }


    protected fun navigateTo(navActionId: Int) {
        runOnView { navController.navigate(navActionId) }
    }
}
