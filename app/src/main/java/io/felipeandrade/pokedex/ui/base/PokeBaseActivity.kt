package io.felipeandrade.pokedex.ui.base

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity

abstract class PokeBaseActivity : AppCompatActivity() {


    abstract fun getPresenter(): PokeBasePresenter
    abstract fun getLayoutRes(): Int

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(getLayoutRes())
        getPresenter().onCreate()
    }


    override fun onDestroy() {
        super.onDestroy()
        getPresenter().onDestroy()
    }

    protected fun navigateTo(clazz: Class<out PokeBaseActivity>) {
        var intent = Intent(this, clazz)
        startActivity(intent)
    }
}