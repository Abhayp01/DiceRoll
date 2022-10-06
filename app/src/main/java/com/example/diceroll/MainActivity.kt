package com.example.diceroll

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val clickme= findViewById<Button>(R.id.click2roll)
        clickme.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {
        var ran=(1..6).random()
        val img = when (ran) {
            1 -> R.drawable.perspective_dice_six_faces_one
            2 -> R.drawable.perspective_dice_six_faces_two
            3 -> R.drawable.perspective_dice_six_faces_three
            4 -> R.drawable.perspective_dice_six_faces_four
            5 -> R.drawable.perspective_dice_six_faces_five
            else -> R.drawable.perspective_dice_six_faces_six
        }
        roll_img.setImageResource(img)

    }
}