package com.test.feature_details

import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FeatureDetailsModule {

    @ContributesAndroidInjector(modules = [FeatureDetailsFragment.Module::class])
    abstract fun bindFeatureDetailsFragment(): FeatureDetailsFragment
}