package io.felipeandrade.pokedex.ui.menu

import io.felipeandrade.pokedex.ui.about.PokeAboutFragment
import io.felipeandrade.pokedex.ui.base.PokeBasePresenter
import io.felipeandrade.pokedex.ui.course.PokeCourseFragment
import io.felipeandrade.pokedex.ui.search.PokeSearchFragment


class PokeMenuPresenter(view: PokeMenuView) : PokeBasePresenter(view) {


    fun btnSearchClicked() {
//        navigateTo(PokeSearchFragment::class.java)
    }

    fun btnCourseClicked() {
//        navigateTo(PokeCourseFragment::class.java)
    }

    fun btnAboutClicked() {
//        navigateTo(PokeAboutFragment::class.java)
    }

}
