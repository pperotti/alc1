package com.pabloperotti.android.samples.alc1.module1

import android.content.Context
import android.widget.Toast

object ToasterMessage {
    fun s(c: Context?, message: String?) {
        Toast.makeText(c, message, Toast.LENGTH_SHORT).show()
    }
}