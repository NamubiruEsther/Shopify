package com.example.shopify

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


        Handler().postDelayed ({

            startActivity(Intent( this@Main2Activity, MainActivity::class.java))

            finish()
        },  2900)//delay in milli seconds
    }
}
