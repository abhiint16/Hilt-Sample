package com.example.mvvmsamplekotlin.views.appviews.home

import android.widget.Toast
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.example.mvvmsamplekotlin.R
import com.example.mvvmsamplekotlin.databinding.ActivityHomeBinding
import com.example.mvvmsamplekotlin.views.appviews.home.viewmodel.HomeActivityViewModel
import com.example.mvvmsamplekotlin.views.baseviews.BaseActivity
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class HomeActivity : BaseActivity<ActivityHomeBinding, HomeActivityViewModel>() {

    @Inject
    lateinit var factory: ViewModelProvider.Factory

    override val setViewModel: ViewModel by viewModels<HomeActivityViewModel>()

    override val layout: Int
        get() = R.layout.activity_home

    override fun initObserver() {
        viewModel.observeForLiveData().observe(this, Observer { boolean ->
            Toast.makeText(this, "Live Data Observed", Toast.LENGTH_LONG).show()
        })
    }

    override fun setUp() {
        viewModel.testFun()
    }

}