package io.felipeandrade.pokedex.menu

import android.os.Bundle
import io.felipeandrade.pokedex.PokeBaseActivity
import io.felipeandrade.pokedex.R
import io.felipeandrade.pokedex.about.PokeAboutActivity
import io.felipeandrade.pokedex.course.PokeCourseActivity
import io.felipeandrade.pokedex.search.PokeSearchActivity
import kotlinx.android.synthetic.main.menu_activity.*

class PokeMenuActivity : PokeBaseActivity<PokeMenuView, PokeMenuPresenter>(), PokeMenuView {


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