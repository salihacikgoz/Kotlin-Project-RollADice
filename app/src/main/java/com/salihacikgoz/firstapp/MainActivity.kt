package com.salihacikgoz.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Message
import android.view.View
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        zar1()
        zar2()
    }
    public fun zarAt(view: View){
        zar1()
        zar2()
    }

    fun zar1(){
        var zar = findViewById<ImageView>(R.id.imageView)

        val rnd = (1..6).random()

        if (rnd == 1){
            zar.setImageResource(R.drawable.one)
        }
        else if(rnd == 2){
            zar.setImageResource(R.drawable.two)
        }
        else if(rnd == 3){
            zar.setImageResource(R.drawable.three)
        }
        else if(rnd == 4){
            zar.setImageResource(R.drawable.four)
        }
        else if(rnd == 5){
            zar.setImageResource(R.drawable.five)
        }
        else if(rnd == 6){
            zar.setImageResource(R.drawable.six)
        }
    }

    fun zar2(){
        var zar1 = findViewById<ImageView>(R.id.imageView2)

        val rnd1 = (1..6).random()

        if (rnd1 == 1){
            zar1.setImageResource(R.drawable.one)
        }
        else if(rnd1 == 2){
            zar1.setImageResource(R.drawable.two)
        }
        else if(rnd1 == 3){
            zar1.setImageResource(R.drawable.three)
        }
        else if(rnd1 == 4){
            zar1.setImageResource(R.drawable.four)
        }
        else if(rnd1 == 5){
            zar1.setImageResource(R.drawable.five)
        }
        else if(rnd1 == 6){
            zar1.setImageResource(R.drawable.six)
        }
    }
}

