package com.example.takingdata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_secondactivity.*

class secondactivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secondactivity)
        val getorder=intent.getStringExtra(MainActivity.key)
        textView2.text=getorder.toString()

    }
}