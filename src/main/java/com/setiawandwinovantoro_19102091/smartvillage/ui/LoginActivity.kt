package com.setiawandwinovantoro_19102091.smartvillage

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.setiawandwinovantoro_19102091.smartvillage.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnToMainActivity.setOnClickListener {
            startActivity(
                Intent(
                    this,
                    MainActivity::class.java
                )
            )
        }
    }
}