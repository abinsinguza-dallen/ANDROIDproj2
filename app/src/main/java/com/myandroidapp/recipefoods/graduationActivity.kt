package com.myandroidapp.recipefoods

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class graduationActivity : AppCompatActivity() {
    lateinit var btngradorders:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_graduation)
        btngradorders=findViewById(R.id.btngradoders)
        btngradorders.setOnClickListener {
            val intent=Intent(this,MakeOrdersActivity::class.java)
            startActivity(intent)
        }
    }
}