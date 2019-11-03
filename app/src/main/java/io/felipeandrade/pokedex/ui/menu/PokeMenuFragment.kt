package io.felipeandrade.pokedex.ui.menu

import android.os.Bundle
import android.view.View
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import io.felipeandrade.pokedex.R
import io.felipeandrade.pokedex.ui.base.PokeBaseFragment
import kotlinx.android.synthetic.main.fragment_menu.*
import org.koin.android.ext.android.inject
import org.koin.core.parameter.parametersOf

class PokeMenuFragment : PokeBaseFragment(), PokeMenuView {


    val pokePresenter: PokeMenuPresenter by inject { parametersOf(this, findNavController()) }

    override fun getPresenter() = pokePresenter
    override fun getLayoutRes() = R.layout.fragment_menu

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setClickListeners()
    }


    private fun setClickListeners() {
        btn_search.setOnClickListener { pokePresenter.btnSearchClicked() }
        btn_course.setOnClickListener { pokePresenter.btnCourseClicked() }
        btn_about.setOnClickListener { pokePresenter.btnAboutClicked() }
    }

}