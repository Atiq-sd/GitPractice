package com.twoshape.gitpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        println("This is the second commit")

        println("Change 1")
        println("Change 2")
        println("Change 3")

        println("Hello from GitPractice 2")

    }
}