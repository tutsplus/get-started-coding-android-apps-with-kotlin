package com.annapurna.envato.myfirstkotlinapplication

import android.widget.EditText

fun isEmpty(editText: EditText) : Boolean {

    val text = editText.text

    return if (text.isEmpty()) {
        editText.error = "Field Required"
        true
    } else
        false
}