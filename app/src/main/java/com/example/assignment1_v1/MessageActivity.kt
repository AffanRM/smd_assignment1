package com.example.assignment1_v1

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MessageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dm_message) // Same as xml file name

        val backIcon: ImageView = findViewById(R.id.back_arrow)
        backIcon.setOnClickListener {
            val intent = Intent(this, DmActivity::class.java)
            startActivity(intent)
        }

        val videoIcon: ImageView = findViewById(R.id.video_call)
        videoIcon.setOnClickListener {
            val intent = Intent(this, VideoCallActivity::class.java)
            startActivity(intent)
        }

    }
}