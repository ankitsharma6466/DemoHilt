package com.test.feature_list

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import com.test.core.ViewModelKey
import dagger.Binds
import dagger.multibindings.IntoMap

class FeatureListFragment: Fragment(R.layout.fragment_feature_list) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

    }

    @dagger.Module
    abstract class Module {

        @Binds
        @IntoMap
        @ViewModelKey(FeatureListViewModel::class)
        internal abstract fun bindFeatureListViewModel(viewModel: FeatureListViewModel): ViewModel
    }
}