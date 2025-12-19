package com.threebya7.carbrowser

import androidx.car.app.Screen
import androidx.car.app.Session
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner

class CarBrowserSession : Session(), DefaultLifecycleObserver {
    override fun onCreate(owner: LifecycleOwner) {
        // Observe the lifecycle of the session.
        lifecycle.addObserver(this)
    }

    override fun onCreateScreen(): Screen {
        // The first screen to be shown when the app launches on the car screen.
        return MainCarScreen(carContext)
    }
}
