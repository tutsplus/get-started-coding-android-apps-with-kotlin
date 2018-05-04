package com.annapurna.envato.myfirstkotlinapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val i = Intent(this, MainActivity::class.java)
        startActivity(i)

        try {
            Thread.sleep(2000)
            // Do some stuff
        } catch (e: Exception) {
            e.printStackTrace()
        }

        finish() // Close the Splash Activity
    }
}
