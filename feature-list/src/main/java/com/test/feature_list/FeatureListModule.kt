package com.test.feature_list

import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class FeatureListModule {

    @ContributesAndroidInjector(modules = [FeatureListFragment.Module::class])
    abstract fun bindFeatureListFragment(): FeatureListFragment
}