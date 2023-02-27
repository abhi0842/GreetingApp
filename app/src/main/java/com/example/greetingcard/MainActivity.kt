package com.example.greetingcard

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun createcard(view: View) {
        //this val is use to find the text view by id
        val nameInput=findViewById<TextView>(R.id.inputtext)
        val name =nameInput.editableText.toString()
        //this val is use to make a intent which is use open the new activity
        //
        val intent= Intent(this,Second_Activity::class.java)
        intent.putExtra(Second_Activity.NAME_EXTRA,name)
        startActivity(intent)
    }
}