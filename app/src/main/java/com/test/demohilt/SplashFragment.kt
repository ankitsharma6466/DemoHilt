package com.test.demohilt

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.test.core.createDestinationUri
import kotlinx.coroutines.delay

class SplashFragment: Fragment(R.layout.fragment_splash) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        viewLifecycleOwner.lifecycleScope.launchWhenCreated {
            delay(1000)
            findNavController().navigate(createDestinationUri("feature_list"))
        }
    }
}