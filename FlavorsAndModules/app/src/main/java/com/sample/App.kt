package com.sample

import android.app.Application
import com.sample.premium.PremiumInitializer

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        PremiumInitializer.initialize()
    }

}
