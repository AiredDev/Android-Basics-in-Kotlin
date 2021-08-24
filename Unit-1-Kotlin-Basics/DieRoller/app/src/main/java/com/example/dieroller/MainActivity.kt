package com.example.dieroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)

        rollButton.setOnClickListener {
            rollDie(findViewById(R.id.imageView))
            rollDie(findViewById(R.id.imageView2))
        }

        rollDie(findViewById(R.id.imageView))
        rollDie(findViewById(R.id.imageView2))
    }

    private fun rollDie(img: ImageView) {
        val die = Die(6)
        val dieRoll = die.roll()

        val drawableResource = when (dieRoll) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        img.setImageResource(drawableResource)
        img.contentDescription = dieRoll.toString()
    }
}

class Die(private val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}