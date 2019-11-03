package io.felipeandrade.pokedex.ui.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.NavHost
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import io.felipeandrade.pokedex.R

abstract class PokeBaseFragment : NavHostFragment() {


    abstract fun getPresenter(): PokeBasePresenter
    abstract fun getLayoutRes(): Int


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflateView(getLayoutRes(), container, inflater)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        getPresenter().onCreate()
    }

    override fun onDestroy() {
        super.onDestroy()
        getPresenter().onDestroy()
    }


    protected fun inflateView(layout: Int, container: ViewGroup?, inflater: LayoutInflater) =
        inflater.inflate(layout, container, false)
}