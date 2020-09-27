package com.test.app_data

import javax.inject.Inject

interface ListRepository {
    fun getItems(): List<String>
}

class ListRepositoryImpl @Inject constructor(): ListRepository {
    override fun getItems(): List<String> {
        return (0..50).map { "List item $it" }
    }
}