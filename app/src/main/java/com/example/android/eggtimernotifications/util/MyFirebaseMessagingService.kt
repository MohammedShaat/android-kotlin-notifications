package com.example.android.eggtimernotifications.util

import android.util.Log
import com.google.firebase.messaging.FirebaseMessagingService

class MyFirebaseMessagingService : FirebaseMessagingService() {
    override fun onNewToken(p0: String?) {
        Log.i("NewToken", "$p0")
    }
}