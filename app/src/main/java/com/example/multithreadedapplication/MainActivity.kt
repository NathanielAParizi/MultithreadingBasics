package com.example.multithreadedapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Math.E
import java.lang.Math.PI

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        runThreadRunnable()


    }

    fun runThreadRunnable() {

        val thread = Thread(Runnable {

            Log.v("THREAD", "Thread started")
            runOnUiThread { textView.text = "Thread Started" }
            for (i in 0..5) {
                runOnUiThread { textView.text = "${PI}\n" }
                Thread.sleep(1000)
            }

        })
        Log.v("THREAD", "Thread stopped")
        thread.start()


    }

}
