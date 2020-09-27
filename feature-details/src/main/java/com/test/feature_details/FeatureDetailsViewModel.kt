package com.test.feature_details

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.test.app_data.DetailsRepository
import javax.inject.Inject

class FeatureDetailsViewModel @Inject constructor(
    private val detailsRepository: DetailsRepository
): ViewModel() {

    val details: LiveData<String> = MutableLiveData(detailsRepository.getDetails())
}