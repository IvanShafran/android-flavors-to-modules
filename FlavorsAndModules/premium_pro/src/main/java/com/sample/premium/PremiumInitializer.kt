package com.sample.premium

import com.sample.premium_interfraces.PremiumApi

object PremiumInitializer {

    fun initialize() {
        PremiumApi.createPremiumInteractor = { PremiumInteractorImpl() }
        PremiumApi.createStoreActivityIntent = { throw IllegalStateException("Store should not be opened in pro") }
    }

}
