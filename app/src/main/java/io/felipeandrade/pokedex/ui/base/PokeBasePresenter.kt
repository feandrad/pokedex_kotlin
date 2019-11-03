package io.felipeandrade.pokedex.ui.base

abstract class PokeBasePresenter(
    private var view: PokeBaseView?
 ) {


    fun onCreate() {

    }

    fun onDestroy() {
        view = null
    }
}
