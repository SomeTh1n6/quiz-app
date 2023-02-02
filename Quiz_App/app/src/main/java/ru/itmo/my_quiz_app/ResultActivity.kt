package ru.itmo.my_quiz_app

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import ru.itmo.my_quiz_app.constants.Data

class ResultActivity : AppCompatActivity() {

    private lateinit var username : String
    private lateinit var totalQuestions : String
    private lateinit var correctAnswers : String

    @SuppressLint("MissingInflatedId", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val results = findViewById<TextView>(R.id.results)
        val restart = findViewById<Button>(R.id.restart)
        val name = findViewById<TextView>(R.id.name_final)

        username = intent.getStringExtra(Data.USER_NAME).toString()
        totalQuestions = intent.getIntExtra(Data.TOTAL_QUESTIONS, 0).toString()
        correctAnswers = intent.getIntExtra(Data.CORRECT_ANSWERS, 0).toString()

        name.text = username
        results.text = "Вы ответили на $correctAnswers из $totalQuestions вопросов"

        restart.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }
}