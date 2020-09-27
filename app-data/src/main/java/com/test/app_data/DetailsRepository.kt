package com.test.app_data

import java.lang.StringBuilder
import javax.inject.Inject

interface DetailsRepository {
    fun getDetails(): String
}

internal class DetailsRepositoryImpl @Inject constructor(
    private val libraryDependency: LibraryDependency
): DetailsRepository {

    override fun getDetails(): String {
        libraryDependency.getLibraryDataA()
        return StringBuilder()
            .append("This is product item list detail.")
            .append("\n")
            .append("very very important details for: ")
            .append("\n")
            .append("INTERNATIONAL ANDROID DEVELOPER MEET")
            .append("\n\n")
            .append("With Data")
            .append("\n")
            .append(libraryDependency.getLibraryDataA())
            .append("\n")
            .append(libraryDependency.getLibraryDataB())
            .toString()
    }
}