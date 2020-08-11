package com.example.mvvmsamplekotlin.datamanager.prefhelper

import android.content.SharedPreferences
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class PreferenceHelperImpl @Inject constructor(
    var sharedPreferences: SharedPreferences
) : PreferenceHelper {

}