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
            Log.i(TAG, getString(R.string.welcome_toast))
        }

        passTextButton.setOnClickListener {
            if (!userText.isEmpty()) {
                val message = userText.text.toString()
                val i = Intent(this, SecondActivity::class.java)
                i.putExtra(Constant.MSG_KEY, message)
                startActivity(i)
            }
            Log.i(TAG, getString(R.string.second_activity_text))
        }

        shareTextButton.setOnClickListener {
            if (!userText.isEmpty()) {
                val message = userText.text.toString()
                val i = Intent()
                i.action = Intent.ACTION_SEND
                i.putExtra(Intent.EXTRA_TEXT, message)
                i.type = "text/plain"
//            startActivity(i)
                startActivity(Intent.createChooser(i, getString(R.string.share_chooser_title)))
            }
            Log.i(TAG, getString(R.string.second_activity_text))
        }
    }

    companion object {
        private val TAG = MainActivity::class.java.simpleName
    }
}
