package com.example.mvvmsamplekotlin.di.modules

import com.example.mvvmsamplekotlin.datamanager.DataManager
import com.example.mvvmsamplekotlin.datamanager.DataManagerImpl
import com.example.mvvmsamplekotlin.datamanager.apihelper.ApiHelper
import com.example.mvvmsamplekotlin.datamanager.apihelper.ApiHelperImpl
import com.example.mvvmsamplekotlin.datamanager.dbhelper.DBHelper
import com.example.mvvmsamplekotlin.datamanager.dbhelper.DBHelperImpl
import com.example.mvvmsamplekotlin.datamanager.prefhelper.PreferenceHelper
import com.example.mvvmsamplekotlin.datamanager.prefhelper.PreferenceHelperImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent

@InstallIn(ApplicationComponent::class)
@Module
abstract class AppModule {

    @Binds
    abstract fun providesDataManager(dataManagerImpl: DataManagerImpl): DataManager

    @Binds
    abstract fun providesApiHelper(apiHelper: ApiHelperImpl): ApiHelper

    @Binds
    abstract fun providesDBHelper(dbHelper: DBHelperImpl): DBHelper

    @Binds
    abstract fun providesPrefHelper(preferenceHelper: PreferenceHelperImpl): PreferenceHelper

}