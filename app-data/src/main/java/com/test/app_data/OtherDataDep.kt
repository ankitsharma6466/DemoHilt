package com.test.app_data

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class OtherDataDep @Inject constructor() {

    fun getOtherDataA(): String = "Hello, this is other data AAA"

    fun getOtherDataB(): String = "Hello, this is other data BBB"
}