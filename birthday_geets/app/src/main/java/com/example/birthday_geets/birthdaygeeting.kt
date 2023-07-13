package com.example.birthday_geets

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class birthdaygeeting : AppCompatActivity() {
    companion object {
        const val NAME_EXTRA ="name_extra"

    }

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthdaygeeting)
        val name=intent.getStringExtra(NAME_EXTRA)
        val birthdaygreeting:TextView=findViewById(R.id.birthdaygeeting)
        birthdaygreeting.text="Happy birthday \n $name "


    }

}