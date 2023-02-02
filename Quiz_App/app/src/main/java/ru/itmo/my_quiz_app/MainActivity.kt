package ru.itmo.my_quiz_app

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val startButton = findViewById<Button>(R.id.btn_start)
        val name= findViewById<TextView>(R.id.name)

        startButton.setOnClickListener {
            if(name.text.toString().trim().isEmpty()) {
                Toast.makeText(this, "Введите имя", Toast.LENGTH_SHORT).show()
            } else {
                val intent = Intent(this, CategoryActivity::class.java)
                intent.putExtra("name", name.text.toString())
                startActivity(intent)
                finish()
            }
        }
    }
}