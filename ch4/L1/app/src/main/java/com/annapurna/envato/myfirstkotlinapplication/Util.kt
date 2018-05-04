package com.annapurna.envato.myfirstkotlinapplication

import android.app.Activity
import android.content.Context
import android.widget.EditText
import android.widget.Toast

/**
 * Check if give [editText] is empty and returns [Boolean]
 * */
fun isEmpty(editText: EditText) : Boolean {

    val text = editText.text

    return if (text.isEmpty()) {
        editText.error = "Field Required"
        true
    } else
        false
}

/**
 * Show the toast [message] for [time] duration
 * */
fun Context.showToast(message: String, time: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(this, message, time).show()
}