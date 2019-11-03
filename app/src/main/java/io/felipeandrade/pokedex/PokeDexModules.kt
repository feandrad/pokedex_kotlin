package io.felipeandrade.pokedex

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
    factory { (view: PokeMenuView) -> PokeMenuPresenter(view) }
    factory { (view: PokeSearchView) -> PokeSearchPresenter(view) }
    factory { (view: PokeAboutView) -> PokeAboutPresenter(view) }
    factory { (view: PokeCourseView) -> PokeCoursePresenter(view) }
}

val usecaseModule = module(override = true) {
}

val domainModule = module(override = true) {
}

val dataModule = module(override = true) {
}
