package io.felipeandrade.pokedex.ui.search

import io.felipeandrade.pokedex.R
import io.felipeandrade.pokedex.ui.base.PokeBaseFragment
import org.koin.android.ext.android.inject
import org.koin.core.parameter.parametersOf

class PokeSearchFragment : PokeBaseFragment(), PokeSearchView {

    val pokePresenter: PokeSearchPresenter by inject { parametersOf(this) }

    override fun getPresenter() = pokePresenter
    override fun getLayoutRes() = R.layout.search_activity

}