package com.test.app_data

import dagger.Binds
import dagger.Module

@Module
abstract class DataModule {

    @Binds
    internal abstract fun bindList(listRepositoryImpl: ListRepositoryImpl): ListRepository

    @Binds
    internal abstract fun bindDetails(detailsRepositoryImpl: DetailsRepositoryImpl): DetailsRepository

}