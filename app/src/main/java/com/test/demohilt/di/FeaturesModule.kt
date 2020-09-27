package com.test.demohilt.di

import com.test.demohilt.SplashFragment
import com.test.feature_list.FeatureListModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module(includes = [
    FeatureListModule::class
])
abstract class FeaturesModule {

    @ContributesAndroidInjector
    abstract fun bindSplashFragment(): SplashFragment
}