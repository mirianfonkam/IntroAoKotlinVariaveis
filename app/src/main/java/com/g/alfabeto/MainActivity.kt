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
        letter = findViewById(R.id.letter)
    }

    fun nextAlphaLetter(view: View) {
        if (alpha < 'Z') {
            alpha++
        } else {
            alpha = 'A'
        }
        letter.text = alpha.toString()
    }


    fun restartAlphaSequence(view: View) {
        alpha = 'A'
        letter.text = alpha.toString()
    }
}