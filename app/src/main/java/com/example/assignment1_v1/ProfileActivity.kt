package com.example.assignment1_v1

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import org.w3c.dom.Text

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile) // Same as xml file name

        val profileIcon: de.hdodenhof.circleimageview.CircleImageView = findViewById(R.id.profile_image)
        profileIcon.setOnClickListener {
            val intent = Intent(this, StoryActivity::class.java)
            startActivity(intent)
        }

        val menuIcon: TextView = findViewById(R.id.edit_profile_btn)
        menuIcon.setOnClickListener {
            val intent = Intent(this, EditProfileActivity::class.java)
            startActivity(intent)
        }

    }
}