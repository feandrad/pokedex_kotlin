package io.felipeandrade.pokedex

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import io.felipeandrade.pokedex.base.PokeBasePresenter
import io.felipeandrade.pokedex.base.PokeBaseView

abstract class PokeBaseActivity<MVPView: PokeBaseView, MVPPresenter : PokeBasePresenter> : AppCompatActivity() {

    var presenter: MVPPresenter? = null


    protected fun navigateTo(clazz: Class<out PokeBaseActivity<*, *>>) {
        var intent = Intent(this, clazz)
        startActivity(intent)
    }
}