package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

//Main
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Button Layout
        val rollButton: Button = findViewById(R.id.button)
        //Click Listener
        rollButton.setOnClickListener { rollDice() }
    }

    //Dice Printer
    private fun rollDice() {
        // Size of Dice
        val dice = Dice(6)
        val diceRoll = dice.roll()
        val diceImage: ImageView = findViewById(R.id.imageView)
        //Dice Display
        val drawableResource = when (diceRoll) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        //Update ImageView with ID
        diceImage.setImageResource(drawableResource)
        // Update content descriptor
        diceImage.contentDescription = diceRoll.toString()
    }
}

//Actual Dice
class Dice(private val numSides: Int) {

  //randomize
    fun roll(): Int {
        return (1..numSides).random()
    }
}