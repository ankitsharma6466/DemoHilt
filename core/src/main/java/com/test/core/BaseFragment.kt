package com.test.core

import androidx.annotation.LayoutRes
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModel
import dagger.android.support.DaggerFragment
import javax.inject.Inject

abstract class BaseFragment constructor(
    @LayoutRes contentLayoutId: Int = 0
): DaggerFragment(contentLayoutId) {

    @Inject lateinit var viewModelFactory: ViewModelFactory

    inline fun <reified VM : ViewModel> createViewModel() = viewModels<VM>({ this }) { viewModelFactory }
}