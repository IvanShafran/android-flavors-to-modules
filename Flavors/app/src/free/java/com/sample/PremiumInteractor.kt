package com.sample

import com.billing.BillingApi

class PremiumInteractor {

    fun isPremium(): Boolean = BillingApi.isPurchased

}
