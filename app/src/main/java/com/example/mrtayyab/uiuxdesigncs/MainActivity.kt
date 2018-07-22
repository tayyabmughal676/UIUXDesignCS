package com.example.mrtayyab.uiuxdesigncs

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    lateinit var mButton : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mButton = findViewById(R.id.singupbtn)

        mButton.setOnClickListener {
            val intent = Intent(applicationContext , SginUpActivity::class.java)
            startActivity(intent)
        }

    }
}
