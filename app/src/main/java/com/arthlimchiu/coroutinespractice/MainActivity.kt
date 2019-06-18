package com.arthlimchiu.coroutinespractice

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        runBlocking {
            val job = launch {
                doWorld()
            }

//            job.join()
            Log.d("MainActivity", "Hello,")
        }
    }

    private suspend fun doWorld() {
        delay(1000L)
        Log.d("MainActivity", "World!")
    }
}