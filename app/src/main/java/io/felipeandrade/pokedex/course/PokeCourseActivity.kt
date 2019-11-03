package io.felipeandrade.pokedex.course

import android.os.Bundle
import io.felipeandrade.pokedex.PokeBaseActivity
import io.felipeandrade.pokedex.R

class PokeCourseActivity: PokeBaseActivity<PokeCourseView, PokeCoursePresenter>(), PokeCourseView {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.course_activity)
    }
}