package com.example.myfirstapp
import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        findViewById<Button>(R.id.button)?.setOnClickListener {
           val greeting = findViewById<TextView>(R.id.textView)
            val firstName = findViewById<EditText>(R.id.editTextText3)?.text.toString().trim()
            val lastName = findViewById<EditText>(R.id.editTextText1)?.text.toString().trim()
            if(firstName.isNotEmpty() && lastName.isNotEmpty()) {
                val nameToDisplay = firstName.plus(" ").plus(lastName)
                greeting.text = "${getString(R.string.Welcome_To_The_App)} $nameToDisplay"
        }else {
            Toast.makeText(this,getString(R.string.Please_Enter_Name),Toast.LENGTH_LONG).show()

        }

        }
    }
}