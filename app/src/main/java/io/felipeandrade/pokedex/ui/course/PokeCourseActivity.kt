package io.felipeandrade.pokedex.ui.course

import io.felipeandrade.pokedex.R
import io.felipeandrade.pokedex.ui.base.PokeBaseActivity
import io.felipeandrade.pokedex.ui.menu.PokeMenuPresenter
import org.koin.android.ext.android.inject
import org.koin.core.parameter.parametersOf

class PokeCourseActivity : PokeBaseActivity(), PokeCourseView {

    private val pokePresenter: PokeCoursePresenter by inject { parametersOf(this) }

    override fun getPresenter() = pokePresenter
    override fun getLayoutRes() = R.layout.course_activity
}