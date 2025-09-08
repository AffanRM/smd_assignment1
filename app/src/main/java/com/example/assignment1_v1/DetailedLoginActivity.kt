package com.example.assignment1_v1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class DetailedLoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailed_login) // Same as xml file name

        // To move to the detailed login view
        val loginButton = findViewById<Button>(R.id.login_button_detailed)

        // Set a click listener
        loginButton.setOnClickListener {
            // Create explicit intent
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)

            finish()
        }
    }
}