package com.sample.premium_interfraces

import android.content.Context
import android.content.Intent

object PremiumApi {

    lateinit var createPremiumInteractor: () -> PremiumInteractor

    lateinit var createStoreActivityIntent: (Context) -> Intent

}
