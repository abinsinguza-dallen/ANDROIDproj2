package com.myandroidapp.recipefoods

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class chooceAcakeActivity : AppCompatActivity() {
    lateinit var btnbirthday:Button
    lateinit var btnwedding:Button
    lateinit var btnGraduation:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chooce_acake)
        btnbirthday=findViewById(R.id.btnbirthday)
        btnbirthday.setOnClickListener {
            val intent=Intent(this,BirthdayActivity::class.java)
            startActivity(intent)
        }
        btnwedding=findViewById(R.id.btnwedding)
        btnwedding.setOnClickListener {
            val intent=Intent(this,WeddingActivity::class.java)
            startActivity(intent)
        }
        btnGraduation=findViewById(R.id.btnGraduation)
        btnGraduation.setOnClickListener {
            val intent=Intent(this,graduationActivity::class.java)
            startActivity(intent)
        }
    }
}