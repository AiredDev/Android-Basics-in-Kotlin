package com.example.dieroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)

        val die = Die(6)
        val die2 = Die(6)

        val dieTextView: TextView = findViewById(R.id.textView)
        val die2TextView: TextView = findViewById(R.id.textView2)

        rollButton.setOnClickListener {
            rollDie(die, dieTextView)
            rollDie(die2, die2TextView)
        }
    }

    private fun rollDie(die: Die, resultTextView: TextView) {
        val dieRoll = die.roll()

        resultTextView.text = dieRoll.toString()
    }
}

class Die(private val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}