package com.example.mvvmsamplekotlin.di.modules

import android.content.Context
import android.content.SharedPreferences
import com.example.mvvmsamplekotlin.AppConstants
import com.example.mvvmsamplekotlin.di.qualifier.PreferenceName
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.qualifiers.ApplicationContext

@InstallIn(ApplicationComponent::class)
@Module
object SharedPrefModule {

    @Provides
    @PreferenceName
    fun providesSharedPrefName(): String {
        return AppConstants.SHARED_PREFERENCE_NAME;
    }

    @Provides
    fun providesSharedPref(@ApplicationContext context: Context, @PreferenceName prefName: String): SharedPreferences {
        return context.getSharedPreferences(prefName, Context.MODE_PRIVATE)
    }
}