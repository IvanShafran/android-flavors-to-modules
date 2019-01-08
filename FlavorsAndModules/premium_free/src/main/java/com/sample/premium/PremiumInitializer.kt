package com.sample.premium

import com.sample.premium_interfraces.PremiumApi

object PremiumInitializer {

    fun initialize() {
        PremiumApi.createPremiumInteractor = { PremiumInteractorImpl() }
        PremiumApi.createStoreActivityIntent = { StoreActivity.getIntent(it) }
    }

}
