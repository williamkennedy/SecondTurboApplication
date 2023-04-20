package com.example.secondturboapplication

import android.view.MenuItem
import androidx.navigation.NavOptions
import androidx.navigation.navOptions
import dev.hotwire.turbo.config.TurboPathConfigurationProperties
import dev.hotwire.turbo.config.context
import dev.hotwire.turbo.nav.TurboNavDestination
import dev.hotwire.turbo.nav.TurboNavPresentationContext

interface NavDestination: TurboNavDestination {
    val menuProgress: MenuItem?
        get() = toolbarForNavigation()?.menu?.findItem(R.id.menu_progress)

    override fun getNavigationOptions(
        newLocation: String,
        newPathProperties: TurboPathConfigurationProperties
    ): NavOptions {
        return when (newPathProperties.context) {
            TurboNavPresentationContext.MODAL -> slideAnimation()
            else -> super.getNavigationOptions(newLocation, newPathProperties)
        }
    }
    private fun slideAnimation(): NavOptions { return navOptions {
        anim {
            enter = R.anim.nav_slide_enter
            exit = R.anim.nav_slide_exit
            popEnter = R.anim.nav_slide_pop_enter
            popExit = R.anim.nav_slide_pop_exit
        } }
    }
}