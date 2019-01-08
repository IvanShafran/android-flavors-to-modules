package com.sample.premium

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.billing.BillingApi
import kotlinx.android.synthetic.main.activity_store.*

class StoreActivity : AppCompatActivity() {

    companion object {
        fun getIntent(context: Context) = Intent(context, StoreActivity::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_store)
        purchaseButton.setOnClickListener {
            BillingApi.isPurchased = true
            updateState()
        }

        updateState()
    }

    private fun updateState() {
        if (BillingApi.isPurchased) {
            purchaseButton.visibility = View.GONE
            purchasedTextView.visibility = View.VISIBLE
        } else {
            purchaseButton.visibility = View.VISIBLE
            purchasedTextView.visibility = View.GONE
        }
    }
}
