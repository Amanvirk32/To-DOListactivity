package com.example.to_dolistactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
  {private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater
        setContentView(binding.root)

                binding.btnSwitchActivity.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)startActivity(intent)
        }
        }
    }
}