package com.sample

import com.billing.BillingApi

class PremiumInteractor {

    fun isPremium(): Boolean {
        return when (BuildConfig.FLAVOR) {
            Flavors.FREE -> BillingApi.isPurchased
            Flavors.PRO -> true
            else -> throw IllegalArgumentException("Unknown flavor")
        }
    }

}
