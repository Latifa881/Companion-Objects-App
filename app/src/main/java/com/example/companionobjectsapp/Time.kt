package com.example.companionobjectsapp

import android.view.View

class Time {
    companion object name {
        val day = true
        val night = false
        fun changeBackground(view: View, isDay: Boolean) {
            when (isDay) {
                true -> {
                    view.setBackgroundResource(R.drawable.day)
                }
                false -> {
                    view.setBackgroundResource(R.drawable.night)
                }
            }
        }
    }

}

