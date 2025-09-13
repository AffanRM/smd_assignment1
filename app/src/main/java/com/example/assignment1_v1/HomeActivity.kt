package com.example.assignment1_v1

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import android.widget.ImageView
class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home) // Same as xml file name

        // Find the search icon using its ID from the included layout
        val searchIcon: ImageView = findViewById(R.id.search_icon)

        // Set an OnClickListener on the search icon
        searchIcon.setOnClickListener {
            // Create the explicit intent to open the new activity
            val intent = Intent(this, SearchMain::class.java)
            startActivity(intent)
        }

        val dmIcon: ImageView = findViewById(R.id.dm_icon)
        dmIcon.setOnClickListener {
            val intent = Intent(this, DmActivity::class.java)
            startActivity(intent)
        }

        val likeIcon: ImageView = findViewById(R.id.like_icon)
        likeIcon.setOnClickListener {
            val intent = Intent(this, FollowingActivity::class.java)
            startActivity(intent)
        }

        val profileIcon: de.hdodenhof.circleimageview.CircleImageView = findViewById(R.id.profile_icon)
        profileIcon.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }

    }
}