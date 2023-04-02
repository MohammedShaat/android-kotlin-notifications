package com.example.android.eggtimernotifications.util

import android.app.Notification
import android.app.NotificationManager
import android.util.Log
import androidx.core.content.ContextCompat
import com.google.firebase.messaging.FirebaseMessagingService
import com.google.firebase.messaging.RemoteMessage

class MyFirebaseMessagingService : FirebaseMessagingService() {
    override fun onNewToken(token: String?) {
        Log.i("NewToken", "$token")
    }

    override fun onMessageReceived(remoteMessage: RemoteMessage?) {
        remoteMessage?.data?.let {
            Log.i("onMessageReceived", "$it")
        }

    }


}