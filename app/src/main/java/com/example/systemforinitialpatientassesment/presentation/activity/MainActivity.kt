package com.example.systemforinitialpatientassesment.presentation.activity

import android.os.Bundle
import android.view.LayoutInflater
import com.example.systemforinitialpatientassesment.databinding.ActivityMainBinding
import com.systemforinitialpatientassesment.core.base.ViewBindingBaseActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ViewBindingBaseActivity<ActivityMainBinding>() {
    override val bindingInflater: (LayoutInflater) -> ActivityMainBinding
        get() = ActivityMainBinding::inflate

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setupNavigation()
        setupToolbar()
        setupBottomBar()
    }

    private fun setupNavigation() = binding.apply {

    }

    private fun setupToolbar() = binding.apply {

    }

    private fun setupBottomBar() = binding.apply {

    }
}