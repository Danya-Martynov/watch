package com.example.watch

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import com.example.watch.databinding.ActivitySignInBinding
import java.util.regex.Pattern.compile

class SignInActivity : Activity() {
    lateinit var email: EditText
    lateinit var password: EditText




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)
        email = findViewById(R.id.email);
        password = findViewById(R.id.password)

    }

    val paternt =("[a-z0-9]{1,256}" +
            "\\@" +
            "[a-z]{1,10}" +
            "\\." +
            "[a-z]{1,3}")
    fun EmailValid (email:String):Boolean {
        return compile(paternt).matcher(email).matches()
    }

    fun main(view: View) {
        if (email.text.toString().isNotEmpty() && password.text.toString().isNotEmpty()) {
            if (EmailValid((email.text.toString()))) {
                val intent = Intent(this, ResultActivity::class.java)
                startActivity(intent)
            }
        }
        else{
          Toast.makeText(this, "Ошибка", Toast.LENGTH_SHORT).show()
        }
    }
}