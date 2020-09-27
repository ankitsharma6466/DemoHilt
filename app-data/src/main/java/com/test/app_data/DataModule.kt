package com.test.app_data

import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
abstract class DataModule {

    @Binds
    internal abstract fun bindList(listRepositoryImpl: ListRepositoryImpl): ListRepository

    @Binds
    internal abstract fun bindDetails(detailsRepositoryImpl: DetailsRepositoryImpl): DetailsRepository

    @Module
    object Provider {

        @Provides
        fun provideLibrary(otherDataDep: OtherDataDep): LibraryDependency {
            return LibraryDependency(otherDataDep)
        }
    }

}