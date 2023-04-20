package com.example.secondturboapplication

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import dev.hotwire.turbo.config.TurboPathConfiguration import dev.hotwire.turbo.session.TurboSessionNavHostFragment import kotlin.reflect.KClass
class SessionNavHostFragment : TurboSessionNavHostFragment() {
    override var sessionName = "main"
    override var startLocation = Api.rootUrl
    override val registeredActivities: List<KClass<out AppCompatActivity>>
        get() = listOf()



    override val registeredFragments: List<KClass<out Fragment>>
        get() = listOf(
            WebFragment::class,
//            ModalWebFragment::class
        )

    override fun onSessionCreated() {
        super.onSessionCreated()
        session.webView.settings.userAgentString = "Turbo Native Android"
    }

    override val pathConfigurationLocation: TurboPathConfiguration.Location
        get() = TurboPathConfiguration.Location( assetFilePath = "json/configuration.json")
}
