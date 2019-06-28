package com.cardenask.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random


class MainActivity : AppCompatActivity() {

    private lateinit var diceImgView : ImageView // Limit the calls to the findViewById. Use lateinit

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton : Button = main_roll_button
        diceImgView = dice_imgview // Actually instantiating the ImageView once. Not every single time in roll dice

        rollButton.setOnClickListener {
            //Toast.makeText(this, "Button Clicked", Toast.LENGTH_SHORT).show()
            rollDice()
        }
    }

    private fun rollDice() {

        val diceVal : Int = Random.nextInt(1, 7) // [from, until)
        val drawableImg : Int = when (diceVal) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            6 -> R.drawable.dice_6
            else -> R.drawable.empty_dice
        }

        diceImgView.setImageResource(drawableImg)
    }
}
