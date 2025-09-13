package com.example.assignment1_v1

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class VideoCallActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.video_call) // Same as xml file name

        val endCard: CardView = findViewById(R.id.end_call)
        endCard.setOnClickListener {
            val intent = Intent(this, MessageActivity::class.java)
            startActivity(intent)
        }

    }
}