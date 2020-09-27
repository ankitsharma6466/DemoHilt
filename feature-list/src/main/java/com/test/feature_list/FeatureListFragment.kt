package com.test.feature_list

import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModel
import androidx.lifecycle.observe
import com.test.core.BaseFragment
import com.test.core.ViewModelKey
import dagger.Binds
import dagger.multibindings.IntoMap
import kotlinx.android.synthetic.main.fragment_feature_list.*

class FeatureListFragment: BaseFragment(R.layout.fragment_feature_list) {

    private val viewModel by createViewModel<FeatureListViewModel>()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        viewModel.items.observe(viewLifecycleOwner) { items ->
            containerTextView.text = ""
            items.forEach { item ->
                containerTextView.append("$item \n")
            }
        }
    }

    @dagger.Module
    abstract class Module {

        @Binds
        @IntoMap
        @ViewModelKey(FeatureListViewModel::class)
        internal abstract fun bindFeatureListViewModel(viewModel: FeatureListViewModel): ViewModel
    }
}