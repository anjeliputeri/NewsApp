package com.app.news.data.remote

import com.app.news.data.response.NewsResponse
import retrofit2.Call
import retrofit2.http.GET


interface ApiServices {

    @GET("top-headlines?country=id&apiKey=2e61146f21b54976bffa0e2dae2b9a6b")
    fun getNews() : Call<NewsResponse>
}