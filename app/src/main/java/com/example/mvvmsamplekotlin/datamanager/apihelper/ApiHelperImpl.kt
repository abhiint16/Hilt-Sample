package com.example.mvvmsamplekotlin.datamanager.apihelper

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ApiHelperImpl @Inject constructor(var apiService: ApiService) : ApiHelper {

}