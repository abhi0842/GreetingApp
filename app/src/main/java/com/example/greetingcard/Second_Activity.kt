package com.example.greetingcard

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.greetingcard.R.id.showtext

class Second_Activity : AppCompatActivity() {

    companion object {
        const val NAME_EXTRA="name_extra"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val name=intent.getStringExtra(NAME_EXTRA)
        val text=findViewById<TextView>(R.id.showtext)
        text.text = "Happy New Year $name"
    }


}