package io.felipeandrade.pokedex.ui.menu

import android.os.Bundle
import io.felipeandrade.pokedex.ui.base.PokeBaseActivity
import io.felipeandrade.pokedex.R
import io.felipeandrade.pokedex.ui.about.PokeAboutActivity
import io.felipeandrade.pokedex.ui.course.PokeCourseActivity
import io.felipeandrade.pokedex.ui.search.PokeSearchActivity
import kotlinx.android.synthetic.main.menu_activity.*
import org.koin.android.ext.android.inject
import org.koin.core.parameter.parametersOf

class PokeMenuActivity : PokeBaseActivity(), PokeMenuView {

    private val pokePresenter: PokeMenuPresenter by inject { parametersOf(this) }

    override fun getPresenter() = pokePresenter
    override fun getLayoutRes() = R.layout.menu_activity

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.menu_activity)
        setClickListeners()
    }

    private fun setClickListeners() {
        btn_search.setOnClickListener { navigateTo(PokeSearchActivity::class.java) }

        btn_course.setOnClickListener { navigateTo(PokeCourseActivity::class.java) }

        btn_about.setOnClickListener { navigateTo(PokeAboutActivity::class.java) }
    }

}