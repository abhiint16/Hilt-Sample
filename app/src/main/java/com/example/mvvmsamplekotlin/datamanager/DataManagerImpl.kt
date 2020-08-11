package com.example.mvvmsamplekotlin.datamanager

import com.example.mvvmsamplekotlin.datamanager.apihelper.ApiHelper
import com.example.mvvmsamplekotlin.datamanager.dbhelper.DBHelper
import com.example.mvvmsamplekotlin.datamanager.prefhelper.PreferenceHelper
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class DataManagerImpl @Inject constructor(
    var apiHelper: ApiHelper,
    var dbHelper: DBHelper,
    var preferenceHelper: PreferenceHelper
) : DataManager {

}