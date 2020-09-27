package com.test.app_data

class LibraryDependency(
    private val otherDataDep: OtherDataDep
) {

    fun getLibraryDataA() = "From Library : ${otherDataDep.getOtherDataA()}"

    fun getLibraryDataB() = "From Library : ${otherDataDep.getOtherDataB()}"

}