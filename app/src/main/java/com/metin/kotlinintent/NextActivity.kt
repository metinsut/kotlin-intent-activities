package com.metin.kotlinintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class NextActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        println("onCreate")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next)
        val intent = intent
        val username = intent.getStringExtra("username");
        val name = intent.getStringExtra("name");

        val userName = findViewById<View>(R.id.textView) as TextView
        val nameText = findViewById<View>(R.id.textView2) as TextView
        userName.text = username.toString()
        nameText.text = name.toString()
    }

    override fun onStart() {
        super.onStart()
        println("onStart")
    }

    override fun onResume() {
        super.onResume()
        println("onResume")
    }

    override fun onPause() {
        super.onPause()
        println("onPause")
    }

    override fun onStop() {
        super.onStop()
        println("onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("onDestroy")
    }

    fun act1(view: View) {
        val intent = Intent(applicationContext, MainActivity::class.java);
        startActivity(intent);
        finish()
    }
}