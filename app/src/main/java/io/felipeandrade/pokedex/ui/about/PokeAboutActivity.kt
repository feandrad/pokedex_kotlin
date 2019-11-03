package io.felipeandrade.pokedex.ui.about

import io.felipeandrade.pokedex.R
import io.felipeandrade.pokedex.ui.base.PokeBaseActivity
import io.felipeandrade.pokedex.ui.menu.PokeMenuPresenter
import org.koin.android.ext.android.inject
import org.koin.core.parameter.parametersOf

class PokeAboutActivity : PokeBaseActivity(), PokeAboutView {

    private val pokePresenter: PokeAboutPresenter by inject { parametersOf(this) }

    override fun getPresenter() = pokePresenter
    override fun getLayoutRes() = R.layout.about_activity

}