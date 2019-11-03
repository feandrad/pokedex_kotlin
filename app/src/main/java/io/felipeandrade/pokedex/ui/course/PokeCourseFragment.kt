package io.felipeandrade.pokedex.ui.course

import io.felipeandrade.pokedex.R
import io.felipeandrade.pokedex.ui.base.PokeBaseFragment
import org.koin.android.ext.android.inject
import org.koin.core.parameter.parametersOf

class PokeCourseFragment : PokeBaseFragment(), PokeCourseView {

    val pokePresenter: PokeCoursePresenter by inject { parametersOf(this, findNavController(this)) }

    override fun getPresenter() = pokePresenter
    override fun getLayoutRes() = R.layout.course_activity

}