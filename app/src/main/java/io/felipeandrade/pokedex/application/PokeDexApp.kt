package io.felipeandrade.pokedex.application

import android.app.Application
import io.felipeandrade.pokedex.di.applicationModule
import io.felipeandrade.pokedex.di.domainModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class PokeDexApp : Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger()
            androidContext(this@PokeDexApp)

            modules(
                listOf(
                    applicationModule,
                    domainModule
                )
            )
        }
    }

}