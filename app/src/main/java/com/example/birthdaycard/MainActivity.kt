package com.example.birthdaycard

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputType
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ProgressBar
import android.widget.Toast
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun createCard(view: View) {
        val name = findViewById<EditText>(R.id.inputUsername).editableText.toString()

        if(name.isEmpty()){
            Toast.makeText(this,"Please Enter a Name.", Toast.LENGTH_SHORT).show()
        }else{
            Toast.makeText(this, "Creating Card for $name", Toast.LENGTH_SHORT).show()

            val intent  = Intent(this,BirthdayMessageActivity::class.java)
            intent.putExtra(BirthdayMessageActivity.NAME_EXTRA, name)
            startActivity(intent)

            findViewById<ProgressBar>(R.id.progressBar).visibility = View.VISIBLE
        }

    }

    override fun onStop() {
        super.onStop()
        findViewById<ProgressBar>(R.id.progressBar).visibility = View.GONE
    }


}