package com.g.alfabeto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var alpha: Char = 'A'
    lateinit var letter : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun nextAlpha(view: View) {
        if (alpha < 'Z') {
            alpha++     //proximo char
        } else {
            alpha = 'A' //auto restart
        }
        letter = findViewById(R.id.letter)
        letter.text = alpha.toString()
    }


    fun restart(view: View) {
        alpha = 'A'    //start
        letter.text = alpha.toString()
    }

}