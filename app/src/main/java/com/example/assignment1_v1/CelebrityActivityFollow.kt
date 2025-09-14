package com.example.assignment1_v1

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class CelebrityActivityFollow: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_celeberity_follow) // Same as xml file name

        val closeIcon: ImageView = findViewById(R.id.back_arrow)
        closeIcon.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }

        val followingIcon: TextView = findViewById(R.id.following_button)
        followingIcon.setOnClickListener {
            val intent = Intent(this, CelebrityActivity::class.java)
            startActivity(intent)
        }

    }
}