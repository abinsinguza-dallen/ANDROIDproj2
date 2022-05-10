package com.myandroidapp.recipefoods

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class
BirthdayActivity : AppCompatActivity() {
    lateinit var btnothers:Button
    lateinit var btnMakeoder:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday)
        btnothers=findViewById(R.id.btnothers)
        btnothers.setOnClickListener {
            val intent=Intent(this,morebirthdaycakes::class.java)
            startActivity(intent)
        }
        btnMakeoder=findViewById(R.id.btnMakeoder)
        btnMakeoder.setOnClickListener {
            val intent=Intent(this,MakeOrdersActivity::class.java)
            startActivity(intent)
        }
    }
}