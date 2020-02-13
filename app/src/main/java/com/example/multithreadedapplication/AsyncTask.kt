package com.example.multithreadedapplication

import android.os.AsyncTask
import android.util.Log
import kotlin.random.Random

class AsyncTaskDemo : AsyncTask<String, String, String>() {

    val randomValues = IntArray(1000)


    override fun onPreExecute() {
        super.onPreExecute()
    }

    override fun doInBackground(vararg params: String?): String {

        for (i in 0..1000 - 1) {
            randomValues[i] = (Random.nextInt(0, 100))

            Log.v("TAG", "$i : \t Value:" +  randomValues[i].toString())
        }

        return ""
    }

    override fun onProgressUpdate(vararg values: String?) {
        super.onProgressUpdate(*values)
    }

    override fun onPostExecute(result: String?) {
        super.onPostExecute(result)
    }


}