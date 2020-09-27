package com.test.feature_list

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.test.app_data.ListRepository
import javax.inject.Inject

class FeatureListViewModel @Inject constructor(
    private val listRepository: ListRepository
): ViewModel() {

    val items: LiveData<List<String>> = MutableLiveData(listRepository.getItems())
}