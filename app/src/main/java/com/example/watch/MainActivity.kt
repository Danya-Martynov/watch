package com.example.watch

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import com.example.watch.databinding.ActivityMainBinding

class MainActivity : Activity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
    fun sign(view: android.view.View) {
        val intent = Intent(this, SignInActivity::class.java)
        startActivity(intent)
    }
}