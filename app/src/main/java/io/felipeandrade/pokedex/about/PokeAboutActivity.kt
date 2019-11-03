package io.felipeandrade.pokedex.about

import android.os.Bundle
import io.felipeandrade.pokedex.PokeBaseActivity
import io.felipeandrade.pokedex.R

class PokeAboutActivity : PokeBaseActivity(), PokeAboutView {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.about_activity)
    }
}