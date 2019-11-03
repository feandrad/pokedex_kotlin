package io.felipeandrade.pokedex

import androidx.navigation.NavHostController
import io.felipeandrade.pokedex.ui.about.PokeAboutPresenter
import io.felipeandrade.pokedex.ui.about.PokeAboutView
import io.felipeandrade.pokedex.ui.course.PokeCoursePresenter
import io.felipeandrade.pokedex.ui.course.PokeCourseView
import io.felipeandrade.pokedex.ui.menu.PokeMenuPresenter
import io.felipeandrade.pokedex.ui.menu.PokeMenuView
import io.felipeandrade.pokedex.ui.search.PokeSearchPresenter
import io.felipeandrade.pokedex.ui.search.PokeSearchView
import org.koin.dsl.module


val applicationModule = module(override = true) {
}

val uiModule = module(override = true) {
    factory { (view: PokeMenuView, navController: NavHostController) -> PokeMenuPresenter(view, navController) }
    factory { (view: PokeSearchView, navController: NavHostController) -> PokeSearchPresenter(view, navController) }
    factory { (view: PokeAboutView, navController: NavHostController) -> PokeAboutPresenter(view, navController) }
    factory { (view: PokeCourseView, navController: NavHostController) -> PokeCoursePresenter(view, navController) }
}

val usecaseModule = module(override = true) {
}

val domainModule = module(override = true) {
}

val dataModule = module(override = true) {
}
