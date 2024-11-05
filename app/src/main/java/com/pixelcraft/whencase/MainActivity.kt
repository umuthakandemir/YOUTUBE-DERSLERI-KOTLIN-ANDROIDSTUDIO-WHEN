package com.pixelcraft.whencase

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        whenfunc(4)
    }
    private var DayString = ""
    private fun whenfunc(day: Int) {
        when(day){
            1 -> DayString = "Pazartesi"
            2 -> DayString = "Salı"
            3 -> DayString = "Çarşamba"
            4 -> DayString = "Perşembe"
            5 -> DayString = "Cuma"
            6 -> DayString = "Cumartesi"
            7 -> DayString = "Pazar"
            else -> DayString = "Nothing"
        }
        println(DayString)
    }
}