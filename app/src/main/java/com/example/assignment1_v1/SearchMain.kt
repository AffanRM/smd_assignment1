package com.example.assignment1_v1

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SearchMain : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.search_main) // Same as xml file name


        val searchLink: TextView = findViewById(R.id.search_bar)
        searchLink.setOnClickListener {
            val intent = Intent(this, SearchTopActivity::class.java)

            startActivity(intent)

            finish()
        }

        val homeIcon: ImageView = findViewById(R.id.home_icon)
        homeIcon.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }

        val searchIcon: ImageView = findViewById(R.id.search_icon)
        // Set an OnClickListener on the search icon
        searchIcon.setOnClickListener {
            // Create the explicit intent to open the new activity
            val intent = Intent(this, SearchMain::class.java)
            startActivity(intent)
        }

        val likeIcon: ImageView = findViewById(R.id.like_icon)
        likeIcon.setOnClickListener {
            val intent = Intent(this, FollowingActivity::class.java)
            startActivity(intent)
        }

        val profileIcon2: de.hdodenhof.circleimageview.CircleImageView = findViewById(R.id.profile_icon)
        profileIcon2.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }

        val postIcon: ImageView = findViewById(R.id.post_icon)
        postIcon.setOnClickListener {
            val intent = Intent(this, UploadActivity::class.java)
            startActivity(intent)
        }

    }
}