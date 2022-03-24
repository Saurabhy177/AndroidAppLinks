package com.example.androidapplinks

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

/**
 * An app link (similar to deeplink) when clicked opens the app directly instead of navigating
 * the user to the browser.
 * For setting up an app link, use:
 *      Tools -> App Link Assistant
 * The main work is to generate the Digital Asset Link (DAL) file and upload it on the website
 * at the specified path.
 *
 * Here, we are using the app link:
 *      https://saurabhy177.github.io/Extras/
 * For this, we had to store the DAL file at the following path:
 *      https://saurabhy177.github.io/.well-known/assetlinks.json
 * */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val uri: Uri? = intent.data
        uri?.let {
            val path = it.toString()
            Toast.makeText(this, path, Toast.LENGTH_LONG).show()
        }
    }
}