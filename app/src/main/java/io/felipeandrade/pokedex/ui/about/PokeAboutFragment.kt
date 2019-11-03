package io.felipeandrade.pokedex.ui.about

import io.felipeandrade.pokedex.R
import io.felipeandrade.pokedex.ui.base.PokeBaseFragment
import org.koin.android.ext.android.inject
import org.koin.core.parameter.parametersOf


class PokeAboutFragment : PokeBaseFragment(), PokeAboutView {

    val pokePresenter: PokeAboutPresenter by inject { parametersOf(this) }

    override fun getPresenter() = pokePresenter
    override fun getLayoutRes() = R.layout.fragment_about

}
