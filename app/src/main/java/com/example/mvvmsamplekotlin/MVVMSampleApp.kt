package com.example.mvvmsamplekotlin

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class MVVMSampleApp : Application() {

    override fun onCreate() {
        super.onCreate()
    }

}