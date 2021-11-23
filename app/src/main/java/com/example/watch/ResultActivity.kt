package com.example.watch

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.watch.databinding.ActivityResultBinding

class ResultActivity : Activity() {

    private lateinit var binding: ActivityResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
    fun take_result(view: View) {
        Toast.makeText(this, "Sucess", Toast.LENGTH_SHORT).show()
    }
}