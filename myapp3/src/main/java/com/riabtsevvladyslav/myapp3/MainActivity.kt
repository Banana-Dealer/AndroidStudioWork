package com.riabtsevvladyslav.myapp3

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.riabtsevvladyslav.myapp3.R.layout

class MainActivity : AppCompatActivity() {
    lateinit var counter_right:TextView
    lateinit var counter_left:TextView
   lateinit var btnr_1:Button
   lateinit var btnr_2:Button
   lateinit var btnr_3:Button
   lateinit var btnl_1:Button
   lateinit var btnl_2:Button
   lateinit var btnl_3:Button
    lateinit var reset:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_main)

        counter_left = findViewById(R.id.textView_left_score)
        counter_right = findViewById(R.id.textView_right_score)

        btnl_1 = findViewById(R.id.button_1point_left)
        btnl_1.setOnClickListener {
            counter_left.text = (counter_left.text.toString().toInt()+1).toString()
        }

        btnl_2 = findViewById(R.id.button_2point_left)
        btnl_2.setOnClickListener {
            counter_left.text = (counter_left.text.toString().toInt()+2).toString()
        }

        btnl_3 = findViewById(R.id.button_3point_left)
        btnl_3.setOnClickListener {
            counter_left.text = (counter_left.text.toString().toInt()+3).toString()
        }

        btnr_1 = findViewById(R.id.button_1point_right)
        btnr_1.setOnClickListener {
            counter_right.text = (counter_right.text.toString().toInt()+1).toString()
        }

        btnr_2= findViewById(R.id.button_2point_right)
        btnr_2.setOnClickListener {
            counter_right.text = (counter_right.text.toString().toInt()+2).toString()
        }

        btnr_3 = findViewById(R.id.button_3point_right)
        btnr_3.setOnClickListener {
            counter_right.text = (counter_right.text.toString().toInt()+3).toString()
        }

        reset = findViewById(R.id.button_reset)
        reset.setOnClickListener {
            counter_right.text = "0"
            counter_left.text = "0"
        }


        }


}