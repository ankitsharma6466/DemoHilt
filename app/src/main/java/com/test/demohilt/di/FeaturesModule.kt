package com.test.demohilt.di

import com.test.app_data.DataModule
import com.test.demohilt.SplashFragment
import com.test.feature_details.FeatureDetailsModule
import com.test.feature_list.FeatureListModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module(includes = [
    DataModule::class,
    FeatureListModule::class,
    FeatureDetailsModule::class
])
abstract class FeaturesModule {

    @ContributesAndroidInjector
    abstract fun bindSplashFragment(): SplashFragment
}