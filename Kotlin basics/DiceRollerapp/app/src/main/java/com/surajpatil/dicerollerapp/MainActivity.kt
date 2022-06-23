package com.surajpatil.dicerollerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var btnroll:Button
    lateinit var imgRoll:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnroll = findViewById(R.id.btnRoll)

        btnroll.setOnClickListener{
            Toast.makeText(this, "Dice Rolled !! ", Toast.LENGTH_SHORT).show()
            rollDice()
        }
    }

    private fun rollDice() {
        val dice = Dice(6)
        val diceRolled = dice.roll()
        imgRoll = findViewById(R.id.imgRoll)

        val DrawableResource = when(diceRolled)
        {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5

            else -> R.drawable.dice_6
        }

        imgRoll.setImageResource(DrawableResource)
        imgRoll.contentDescription = diceRolled.toString()
    }
}