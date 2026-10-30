package com.robboy.ytstorefront

import android.app.Activity
import android.content.Intent
import android.net.Uri
import android.os.Bundle

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        try {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/feed/storefront?bp=ogUCKAQ%3D")).apply {
                setPackage("com.google.android.youtube.tv")
                addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            }
            startActivity(intent)
        } catch (e: Exception) {
            // Ignorera om appen inte hittas
        }
        finish()
    }
}
