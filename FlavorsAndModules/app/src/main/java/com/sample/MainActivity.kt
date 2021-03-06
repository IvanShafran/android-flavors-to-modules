package com.sample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.sample.premium_interfraces.PremiumApi
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val premiumInteractor = PremiumApi.createPremiumInteractor()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        storeButton.setOnClickListener {
            startActivity(PremiumApi.createStoreActivityIntent(this))
        }
        versionTextView.text = BuildConfig.FLAVOR
    }

    override fun onResume() {
        super.onResume()
        updateState()
    }

    private fun updateState() {
        if (premiumInteractor.isPremium()) {
            storeButton.visibility = View.GONE
            contentTextView.visibility = View.VISIBLE
        } else {
            storeButton.visibility = View.VISIBLE
            contentTextView.visibility = View.GONE
        }
    }
}
