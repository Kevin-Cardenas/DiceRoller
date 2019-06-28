package com.cardenask.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton : Button = main_roll_button
        val tvValue : TextView = main_number_tv
        
        rollButton.setOnClickListener {
            //Toast.makeText(this, "Button Clicked", Toast.LENGTH_SHORT).show()
            rollDice(tvValue)
        }

    }

    private fun rollDice(tvValue : TextView) {

        val diceVal : Int = Random.nextInt(1, 6)

        tvValue.text = diceVal.toString()
    }
}
