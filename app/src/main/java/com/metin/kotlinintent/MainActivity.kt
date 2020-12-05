package com.metin.kotlinintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    private lateinit var userName: EditText
    private lateinit var name: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        userName = findViewById<View>(R.id.userName) as EditText
        name = findViewById<View>(R.id.name) as EditText
    }

    fun next(view: View) {
        val intent = Intent(applicationContext, NextActivity::class.java);
        intent.putExtra("username", userName.text.toString())
        intent.putExtra("name", name.text.toString())
        startActivity(intent);
        finish()
    }
}