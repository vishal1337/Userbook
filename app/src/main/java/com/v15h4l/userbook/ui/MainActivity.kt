package com.v15h4l.userbook.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.v15h4l.userbook.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}