package com.sample

import android.content.Context
import android.content.Intent

object StoreActivity {

    fun getIntent(context: Context): Intent = throw IllegalStateException("Store should not be opened in pro")

}
