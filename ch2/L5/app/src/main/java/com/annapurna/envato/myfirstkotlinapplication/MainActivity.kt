package com.annapurna.envato.myfirstkotlinapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toastButton.setOnClickListener {

            Toast.makeText(applicationContext, getString(R.string.welcome_toast), Toast.LENGTH_SHORT).show()
        }
    }
}
