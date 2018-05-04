package com.annapurna.envato.myfirstkotlinapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toastButton.setOnClickListener {
            showToast(getString(R.string.welcome_toast), Toast.LENGTH_LONG)
            Log.i(MainActivity::class.java.simpleName, getString(R.string.welcome_toast))
        }

        passTextButton.setOnClickListener {
            if (!isEmpty(userText)) {
                val message = userText.text.toString()
                val i = Intent(this, SecondActivity::class.java)
                i.putExtra("user_data", message)
                startActivity(i)
            }
            Log.i(MainActivity::class.java.simpleName, getString(R.string.second_activity_text))
        }

        shareTextButton.setOnClickListener {
            if (!isEmpty(userText)) {
                val message = userText.text.toString()
                val i = Intent()
                i.action = Intent.ACTION_SEND
                i.putExtra(Intent.EXTRA_TEXT, message)
                i.type = "text/plain"
//            startActivity(i)
                startActivity(Intent.createChooser(i, getString(R.string.share_chooser_title)))
            }
            Log.i(MainActivity::class.java.simpleName, getString(R.string.second_activity_text))
        }
    }
}
