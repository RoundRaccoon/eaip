package com.danielnastase.eaip

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.statusBarColor = getColor(R.color.black)
        window.navigationBarColor = 0xFF17181D.toInt()

        setContent{ GooderScreen() }
    }
}