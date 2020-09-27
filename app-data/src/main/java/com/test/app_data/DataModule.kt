package com.test.app_data

import dagger.Binds
import dagger.Module

@Module
abstract class DataModule {

    @Binds
    abstract fun bindList(listRepositoryImpl: ListRepositoryImpl): ListRepository

    @Binds
    abstract fun bindDetails(detailsRepositoryImpl: DetailsRepositoryImpl): DetailsRepository

}