package com.myandroidapp.recipefoods

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class morebirthdaycakes : AppCompatActivity() {
    lateinit var btnmoreOders:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_morebirthdaycakes)
        btnmoreOders=findViewById(R.id.btnmoreOrders)
        btnmoreOders.setOnClickListener {
            val intent= Intent (this,MakeOrdersActivity::class.java)
            startActivity(intent)
        }
    }
}