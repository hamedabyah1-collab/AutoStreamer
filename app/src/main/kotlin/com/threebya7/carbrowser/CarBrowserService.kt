package com.threebya7.carbrowser

import androidx.car.app.CarAppService
import androidx.car.app.Session
import androidx.car.app.validation.HostValidator

class CarBrowserService : CarAppService() {
    override fun onCreateSession(): Session {
        // This is the entry point for the car app.
        // We will return a custom Session that handles the car screen logic.
        return CarBrowserSession()
    }

    override fun create  HostValidator(): HostValidator {
        // This is crucial for sideloading. We allow all hosts defined in app_host_config.xml
        return HostValidator.Builder(applicationContext)
            .build()
    }
}
