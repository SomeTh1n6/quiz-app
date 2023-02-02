package ru.itmo.my_quiz_app

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.core.content.ContextCompat
import ru.itmo.my_quiz_app.constants.Data
import kotlin.random.Random

class QuizActivity : AppCompatActivity(), View.OnClickListener{
    private var curentPosition : Int = 1
    private var curentElementPosition : Int = 1
    private var correctAnswers : Int = 0
    private var questionsList: ArrayList<Questions>? = null
    private var userName : String? = null
    private var selectedOptionPosition: Int = 0

    private lateinit var question : TextView
    private lateinit var ans1 : TextView
    private lateinit var ans2 : TextView
    private lateinit var ans3 : TextView
    private lateinit var ans4 : TextView
    private lateinit var btnNext : Button
    private lateinit var image : ImageView
    private lateinit var progress : ProgressBar
    private lateinit var progressCnt : TextView
    private lateinit var randomValues : List<Int>
    private lateinit var TEST_NAME : String

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)

        question = findViewById<TextView>(R.id.question)
        ans1 = findViewById<TextView>(R.id.option_one)
        ans2 = findViewById<TextView>(R.id.option_two)
        ans3 = findViewById<TextView>(R.id.option_three)
        ans4 = findViewById<TextView>(R.id.option_four)
        btnNext = findViewById<Button>(R.id.btn_next)
        image = findViewById<ImageView>(R.id.picture)
        progress = findViewById<ProgressBar>(R.id.progressBar)
        progressCnt = findViewById<TextView>(R.id.count_progress)

        TEST_NAME = intent.getStringExtra("type").toString()
        userName = intent.getStringExtra("name")
        when (TEST_NAME) {
            "Android" -> {
                questionsList = Data.getQuestionsAndroid()
                randomValues =
                    generateSequence { Random.nextInt(1, 100) }.distinct().take(10).sorted().toSet().toList()
            }
            "Java" -> {
                questionsList = Data.getQuestionsJava()
                randomValues =
                    generateSequence { Random.nextInt(1, 199) }.distinct().take(10).sorted().toSet().toList()
            }
            "Python" -> {
                questionsList = Data.getQuestionsPython()
                randomValues =
                    generateSequence { Random.nextInt(1, 100) }.distinct().take(10).sorted().toSet().toList()
            }
            "Linux" -> {
                questionsList = Data.getQuestionsLinux()
                randomValues =
                    generateSequence { Random.nextInt(1, 242) }.distinct().take(10).sorted().toSet().toList()
            }
        }

        curentElementPosition = randomValues[0]

        setQuestion()

        ans1.setOnClickListener(this)
        ans2.setOnClickListener(this)
        ans3.setOnClickListener(this)
        ans4.setOnClickListener(this)
        btnNext.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.option_one -> {selectOption(ans1,1)}
            R.id.option_two -> {selectOption(ans2,2)}
            R.id.option_three -> {selectOption(ans3,3)}
            R.id.option_four -> {selectOption(ans4,4)}

            R.id.btn_next -> {
                if(selectedOptionPosition == 0) {
                    curentPosition++

                    when {
                        curentPosition <= 10 -> {
                            curentElementPosition = randomValues[curentPosition-1]
                            setQuestion()
                            ans1.isClickable = true;
                            ans2.isClickable = true;
                            ans3.isClickable = true;
                            ans4.isClickable = true;
                        } else -> {
                        val intent = Intent(this@QuizActivity, ResultActivity::class.java)
                        intent.putExtra("type", TEST_NAME)
                        intent.putExtra(Data.USER_NAME, userName)
                        intent.putExtra(Data.CORRECT_ANSWERS, correctAnswers)
                        intent.putExtra(Data.TOTAL_QUESTIONS, progress.max)
                        startActivity(intent)
                    }
                    }
                } else {
                    val question = questionsList?.get(curentElementPosition)
                    if (question!!.correctAnswer != selectedOptionPosition) {
                        answerView(selectedOptionPosition, R.drawable.wrong_option)
                    } else {
                        correctAnswers++
                    }
                    answerView(question.correctAnswer, R.drawable.correct_option)

                    if(curentPosition == 10) {
                        btnNext.text = "ПЕРЕЙТИ К РЕЗУЛЬТАТАМ"
                    } else {
                        btnNext.text = "СЛЕДУЮЩИЙ ВОПРОС"
                        ans1.isClickable = false;
                        ans2.isClickable = false;
                        ans3.isClickable = false;
                        ans4.isClickable = false;
                    }
                    selectedOptionPosition = 0
                }
            }
        }
    }

    private fun answerView(answer: Int, drawableView: Int) {
        when (answer) {
            1 -> {
                ans1.background = ContextCompat.getDrawable(
                    this, drawableView
                )
            }
            2 -> {
                ans2.background = ContextCompat.getDrawable(
                    this, drawableView
                )
            }
            3 -> {
                ans3.background = ContextCompat.getDrawable(
                    this, drawableView
                )
            }
            4 -> {
                ans4.background = ContextCompat.getDrawable(
                    this, drawableView
                )
            }
        }
    }

    private fun setDefaultSettings(){
        val options = ArrayList<TextView>()
        options.add(0, ans1)
        options.add(1, ans2)
        options.add(2, ans3)
        options.add(3, ans4)

        for (option in options) {
            option.setTextColor(Color.parseColor("#757575"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(
                this,
                R.drawable.border_textview
            )
        }
        btnNext.text = "Пропустить"
    }

    private fun selectOption(tv: TextView, selectedNum: Int){
        setDefaultSettings()
        selectedOptionPosition = selectedNum

        tv.setTypeface(tv.typeface, Typeface.BOLD)
        tv.setTextColor(Color.BLACK)
        tv.background = ContextCompat.getDrawable(
            this,
            R.drawable.selected_textview
        )
        btnNext.text = "Далее"
    }

    @SuppressLint("SetTextI18n")
    private fun setQuestion() {
        setDefaultSettings()

        val questionNum = questionsList!![curentElementPosition]

        question.text = questionNum.question
        image.setImageResource(questionNum.image)
        progress.progress = curentPosition
        progressCnt.text= "$curentPosition" + "/" + progress.max

        ans1.text = questionNum.optionOne
        ans2.text = questionNum.optionTwo
        ans3.text = questionNum.optionThree
        ans4.text = questionNum.optionFour
    }
}