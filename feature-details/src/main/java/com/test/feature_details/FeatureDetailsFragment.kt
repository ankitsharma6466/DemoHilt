package com.test.feature_details

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import com.test.core.ViewModelKey
import dagger.Binds
import dagger.multibindings.IntoMap

class FeatureDetailsFragment: Fragment(R.layout.fragment_feature_details) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

    }

    @dagger.Module
    abstract class Module {

        @Binds
        @IntoMap
        @ViewModelKey(FeatureDetailsViewModel::class)
        internal abstract fun bindFeatureDetailsViewModel(viewModel: FeatureDetailsViewModel): ViewModel
    }

}