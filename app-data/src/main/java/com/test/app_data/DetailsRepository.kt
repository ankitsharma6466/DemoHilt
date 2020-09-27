package com.test.app_data

import javax.inject.Inject

interface DetailsRepository {
    fun getDetails(): String
}

internal class DetailsRepositoryImpl @Inject constructor(): DetailsRepository {

    override fun getDetails(): String {
        return "This is product item list detail. very very important details for \n INTERNATIONAL ANDROID DEVELOPER MEET"
    }
}