package io.felipeandrade.pokedex

import android.app.Application
import io.felipeandrade.pokedex.applicationModule
import io.felipeandrade.pokedex.domainModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class PokeDexApp : Application() {

    override fun onCreate() {
        super.onCreate()
        initDependencyInjection()
    }

    private fun initDependencyInjection() {
        startKoin {
            androidLogger()
            androidContext(this@PokeDexApp)
            modules(
                listOf(
                    applicationModule,
                    uiModule,
                    usecaseModule,
                    domainModule,
                    dataModule
                )
            )
        }
    }

}