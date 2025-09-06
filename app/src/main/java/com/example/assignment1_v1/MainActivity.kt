package com.example.assignment1_v1

import android.content.Intent
import android.widget.TextView

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // To move from the main page to the signup page
        val signupLink: TextView = findViewById(R.id.signup_link)

        signupLink.setOnClickListener {
            // 3. Create an explicit intent to navigate to SignupActivity
            val intent = Intent(this, SignupActivity::class.java)

            startActivity(intent)
        }

    }
}