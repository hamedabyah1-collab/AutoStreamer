package com.threebya7.carbrowser

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // This activity is primarily a placeholder for the phone side.
        // In a real sideloaded app, this is where the WebView mirroring logic would reside.
        // For this example, we'll just show a simple message.
        setContentView(R.layout.activity_main)
        Toast.makeText(this, "3bya7 is installed. Connect to Android Auto.", Toast.LENGTH_LONG).show()
    }
}
