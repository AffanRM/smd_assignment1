package com.example.assignment1_v1

import android.content.Intent
import android.os.Bundle
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

    }
}