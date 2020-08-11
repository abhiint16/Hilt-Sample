package com.example.mvvmsamplekotlin.views.appviews.home.di

import androidx.lifecycle.ViewModelProvider
import com.example.mvvmsamplekotlin.datamanager.DataManager
import com.example.mvvmsamplekotlin.utils.ViewModelProviderFactory
import com.example.mvvmsamplekotlin.views.appviews.home.viewmodel.HomeActivityViewModel
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.scopes.ActivityScoped

@InstallIn(ActivityComponent::class)
@Module
class HomeActivityModule {

    @Provides
    @ActivityScoped
    fun providesHomeActivityViewModel(dataManager: DataManager): HomeActivityViewModel {
        return HomeActivityViewModel(dataManager)
    }

    @Provides
    @ActivityScoped
    fun providesViewModelProvider(homeActivityViewModel: HomeActivityViewModel): ViewModelProvider.Factory {
        return ViewModelProviderFactory(homeActivityViewModel)
    }
}