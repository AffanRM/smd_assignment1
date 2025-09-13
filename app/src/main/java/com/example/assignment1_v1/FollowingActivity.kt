package com.example.assignment1_v1

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class FollowingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_following) // Same as xml file name

        val youLink: TextView = findViewById(R.id.you_tab)
        youLink.setOnClickListener {
            val intent = Intent(this, YouActivity::class.java)
            startActivity(intent)
        }

    }
}