package io.felipeandrade.pokedex.ui.course
import android.view.View
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import io.felipeandrade.pokedex.R
import io.felipeandrade.pokedex.ui.base.PokeBaseActivity
import io.felipeandrade.pokedex.ui.menu.PokeMenuPresenter
import org.koin.android.ext.android.inject
import org.koin.core.parameter.parametersOf

class PokeCourseActivity : PokeBaseActivity(), PokeCourseView {

    private val pokePresenter: PokeCoursePresenter by inject { parametersOf(this) }
    private lateinit var webView: WebView
    override fun getPresenter() = pokePresenter
    override fun getLayoutRes() = R.layout.course_activity

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.about_activity)

        webView = findViewById(R.id.webPage)
        webView.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
                view?.loadUrl(url)
                return true
            }
        }
        webView.loadUrl("https://www.fiap.com.br/graduacao/tecnologo/jogos-digitais/")
    }




}