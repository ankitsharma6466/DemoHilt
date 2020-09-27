package com.test.feature_details

import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModel
import androidx.lifecycle.observe
import com.test.core.BaseFragment
import com.test.core.ViewModelKey
import dagger.Binds
import dagger.multibindings.IntoMap
import kotlinx.android.synthetic.main.fragment_feature_details.*

class FeatureDetailsFragment: BaseFragment(R.layout.fragment_feature_details) {

    private val viewModel by createViewModel<FeatureDetailsViewModel>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        viewModel.details.observe(viewLifecycleOwner) {
            containerTextView.text = it
        }
    }

    @dagger.Module
    abstract class Module {

        @Binds
        @IntoMap
        @ViewModelKey(FeatureDetailsViewModel::class)
        internal abstract fun bindFeatureDetailsViewModel(viewModel: FeatureDetailsViewModel): ViewModel
    }

}