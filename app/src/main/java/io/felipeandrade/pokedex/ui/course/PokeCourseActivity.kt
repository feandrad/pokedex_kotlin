package io.felipeandrade.pokedex.ui.course
import android.view.View
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import io.felipeandrade.pokedex.R
import io.felipeandrade.pokedex.ui.base.PokeBaseActivity
import io.felipeandrade.pokedex.ui.menu.PokeMenuPresenter
import kotlinx.android.synthetic.main.course_activity.*
import org.koin.android.ext.android.inject
import org.koin.core.parameter.parametersOf

class PokeCourseActivity : PokeBaseActivity(), PokeCourseView {

    private val pokePresenter: PokeCoursePresenter by inject { parametersOf(this) }
    private lateinit var webView: WebView
    override fun getPresenter() = pokePresenter
    override fun getLayoutRes() = R.layout.course_activity

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.course_activity)

        setContentView(R.layout.course_activity)
        webView = findViewById(R.id.webPage) as WebView
        webView.webViewClient = WebViewClient()
        val webSettings = webPage.getSettings()
        webSettings.setJavaScriptEnabled(true);
        webSettings.setAllowContentAccess(true);
        webSettings.setAppCacheEnabled(true);
        webSettings.setDomStorageEnabled(true);
        webSettings.setUseWideViewPort(true);
        //webView.loadUrl("https://www.fiap.com.br/graduacao/tecnologo/jogos-digitais/")
        webPage.loadUrl("https://www.fiap.com.br/graduacao/tecnologo/jogos-digitais/")
    }




}