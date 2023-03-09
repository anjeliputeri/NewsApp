package com.app.news.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.app.news.R
import com.app.news.data.remote.ApiClient
import com.app.news.data.response.NewsResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ApiClient.create().getNews().enqueue(object : Callback<NewsResponse>{
            override fun onResponse(call: Call<NewsResponse>, response: Response<NewsResponse>) {
            }

            override fun onFailure(call: Call<NewsResponse>, t: Throwable) {
                TODO("Not yet implemented")
            }

        })
    }
}