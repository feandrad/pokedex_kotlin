package io.felipeandrade.pokedex.di

import io.felipeandrade.pokedex.about.PokeAboutPresenter
import io.felipeandrade.pokedex.about.PokeAboutView
import io.felipeandrade.pokedex.course.PokeCoursePresenter
import io.felipeandrade.pokedex.course.PokeCourseView
import io.felipeandrade.pokedex.menu.PokeMenuPresenter
import io.felipeandrade.pokedex.menu.PokeMenuView
import io.felipeandrade.pokedex.search.PokeSearchPresenter
import io.felipeandrade.pokedex.search.PokeSearchView
import org.koin.dsl.module


val applicationModule = module(override = true) {
//    factory { (view: PokeMenuView) -> PokeMenuPresenter(view) }
//    factory { (view: PokeSearchView) -> PokeSearchPresenter(view) }
//    factory { (view: PokeAboutView) -> PokeAboutPresenter(view) }
//    factory { (view: PokeCourseView) -> PokeCoursePresenter(view) }
}

val domainModule = module(override = true) {
//    factory { OnMoviesRequestUseCase() }
}