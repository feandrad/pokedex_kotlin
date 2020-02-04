package io.felipeandrade.pokedex.ui.about

import android.os.Bundle
import io.felipeandrade.pokedex.R
import io.felipeandrade.pokedex.ui.base.PokeBaseActivity
import io.felipeandrade.pokedex.ui.course.PokeCourseActivity
import io.felipeandrade.pokedex.ui.menu.PokeMenuPresenter
import io.felipeandrade.pokedex.ui.search.PokeSearchActivity
import io.felipeandrade.pokedex.ui.menu.PokeMenuActivity
import kotlinx.android.synthetic.main.about_activity.*
import kotlinx.android.synthetic.main.menu_activity.*
import org.koin.android.ext.android.inject
import org.koin.core.parameter.parametersOf

class PokeAboutActivity : PokeBaseActivity(), PokeAboutView {

    private val pokePresenter: PokeAboutPresenter by inject { parametersOf(this) }

    override fun getPresenter() = pokePresenter
    override fun getLayoutRes() = R.layout.about_activity

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.about_activity)
        setClickListeners()
    }

    private fun setClickListeners() {
        btn_menu.setOnClickListener { navigateTo(PokeMenuActivity::class.java) }

    }
}