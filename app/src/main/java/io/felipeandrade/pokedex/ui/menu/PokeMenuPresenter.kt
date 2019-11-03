package io.felipeandrade.pokedex.ui.menu

import androidx.navigation.NavController
import io.felipeandrade.pokedex.R
import io.felipeandrade.pokedex.ui.base.PokeBasePresenter


class PokeMenuPresenter(view: PokeMenuView, navController: NavController) :
    PokeBasePresenter(view, navController) {


    fun btnSearchClicked() {
        navigateTo(R.id.pokeSearchFragment)
    }

    fun btnCourseClicked() {
        navigateTo(R.id.pokeCourseFragment)
    }

    fun btnAboutClicked() {
        navigateTo(R.id.pokeAboutFragment)
    }

}
