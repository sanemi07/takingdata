package com.example.takingdata

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    companion object{
        const val key="com.example.takingdata.mainactivity.key"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        placeorder.setOnClickListener(){
            val message=et1.text.toString()+et2.text.toString()+et3.text.toString()+et4.text.toString()
            val intent=Intent(this,secondactivity::class.java)
            intent.putExtra(key,message)
            startActivity(intent)
        }
    }
}