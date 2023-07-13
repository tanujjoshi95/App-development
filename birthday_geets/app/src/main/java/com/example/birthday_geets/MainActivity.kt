package com.example.birthday_geets

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val birthdaybutton : Button=findViewById(R.id.button)
        birthdaybutton.setOnClickListener {
            createCard()

        }
    }

    fun createCard()

    {
        val nameInput:EditText=findViewById(R.id.nameInput)
        val name= nameInput.editableText.toString()
        Toast.makeText(this,"Button Clicked",Toast.LENGTH_SHORT).show()
        val intent=Intent(this,birthdaygeeting::class.java)
        intent.putExtra(birthdaygeeting.NAME_EXTRA,name)
        startActivity(intent)

    }

}