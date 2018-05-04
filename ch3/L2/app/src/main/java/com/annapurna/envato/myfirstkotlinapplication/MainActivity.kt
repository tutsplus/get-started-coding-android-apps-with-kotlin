package com.annapurna.envato.myfirstkotlinapplication

import android.content.Intent
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

        passTextButton.setOnClickListener {
            val message = userText.text.toString()
            val i = Intent(this, SecondActivity::class.java)
            i.putExtra("user_data", message)
            startActivity(i)
        }

        shareTextButton.setOnClickListener {
            val message = userText.text.toString()
            val i = Intent()
            i.action = Intent.ACTION_SEND
            i.putExtra(Intent.EXTRA_TEXT, message)
            i.type = "text/plain"
//            startActivity(i)
            startActivity(Intent.createChooser(i, getString(R.string.share_chooser_title)))
        }
    }
}
