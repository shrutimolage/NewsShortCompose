package com.example.newsshortcompose

import android.app.Application
import android.util.Log
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class NewsAppCompose:Application() {
    override fun onCreate() {
        super.onCreate()
        Log.d(TAG,"coming inside_oncreate")
    }
    companion object{
        const val TAG = "NewsApplication"
    }
}

