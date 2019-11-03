package io.felipeandrade.pokedex.ui.search

import io.felipeandrade.pokedex.R
import io.felipeandrade.pokedex.ui.base.PokeBaseActivity
import io.felipeandrade.pokedex.ui.menu.PokeMenuPresenter
import org.koin.android.ext.android.inject
import org.koin.core.parameter.parametersOf

class PokeSearchActivity : PokeBaseActivity(), PokeSearchView {

    private val pokePresenter: PokeSearchPresenter by inject { parametersOf(this) }

    override fun getPresenter() = pokePresenter
    override fun getLayoutRes() = R.layout.search_activity

}