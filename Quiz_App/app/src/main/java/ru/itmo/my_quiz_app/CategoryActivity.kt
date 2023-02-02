package ru.itmo.my_quiz_app

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity


class CategoryActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_category)

        val name = intent.extras !!["name"].toString() // take name from previous activity


        val androidButton = findViewById<ImageButton>(R.id.android)
        androidButton.setOnClickListener {
            val intent = Intent(this@CategoryActivity, QuizActivity::class.java)
            intent.putExtra("type", "Android")
            intent.putExtra("name", name)
            startActivity(intent)
        }

        val javaButton = findViewById<ImageButton>(R.id.java)
        javaButton.setOnClickListener {
            val intent = Intent(this@CategoryActivity, QuizActivity::class.java)
            intent.putExtra("type", "Java")
            intent.putExtra("name", name)
            startActivity(intent)
        }

        val linuxButton = findViewById<ImageButton>(R.id.linux)
        linuxButton.setOnClickListener {
            val intent = Intent(this@CategoryActivity, QuizActivity::class.java)
            intent.putExtra("type", "Linux")
            intent.putExtra("name", name)
            startActivity(intent)
        }
        val pythonButton = findViewById<ImageButton>(R.id.python)
        pythonButton.setOnClickListener {
            val intent = Intent(this@CategoryActivity, QuizActivity::class.java)
            intent.putExtra("type", "Python")
            intent.putExtra("name", name)
            startActivity(intent)
        }
    }
}