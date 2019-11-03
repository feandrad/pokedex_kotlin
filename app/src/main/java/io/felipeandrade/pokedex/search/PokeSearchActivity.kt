package io.felipeandrade.pokedex.search

import android.os.Bundle
import io.felipeandrade.pokedex.PokeBaseActivity
import io.felipeandrade.pokedex.R

class PokeSearchActivity: PokeBaseActivity(), PokeSearchView {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.search_activity)
    }
}