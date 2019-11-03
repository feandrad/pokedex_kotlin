package io.felipeandrade.pokedex

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity

abstract class PokeBaseActivity : AppCompatActivity() {

    protected fun navigateTo(clazz: Class<out PokeBaseActivity>) {
        var intent = Intent(this, clazz)
        startActivity(intent)
    }
}