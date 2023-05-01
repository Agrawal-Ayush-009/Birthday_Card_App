package com.example.birthdaycard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class BirthdayMessageActivity : AppCompatActivity() {
    companion object{
        const val NAME_EXTRA = "name_extra"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_message)

        val name = intent.getStringExtra(NAME_EXTRA)
        (findViewById(R.id.birthdayGreet) as TextView).text = "Happy Birthday\n$name!"

    }
}