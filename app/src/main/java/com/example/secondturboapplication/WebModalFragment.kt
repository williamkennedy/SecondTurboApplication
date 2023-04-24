package com.example.secondturboapplication

import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.Toolbar
import androidx.core.content.ContextCompat
import dev.hotwire.turbo.nav.TurboNavGraphDestination

@TurboNavGraphDestination(uri = "turbo://fragment/web/modal")
class WebModalFragment : WebFragment() {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initToolbar()
    }


    private fun initToolbar() {
        toolbarForNavigation()?.displayBackButtonAsCloseIcon()
    }
}

fun Toolbar.displayBackButtonAsCloseIcon() {
    navigationIcon = ContextCompat.getDrawable(context, R.drawable.ic_close)
}
