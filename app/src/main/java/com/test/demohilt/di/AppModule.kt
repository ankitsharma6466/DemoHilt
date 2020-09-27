package com.test.demohilt.di

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.test.app_data.DataModule
import com.test.core.ActivityContext
import com.test.core.ApplicationContext
import com.test.core.ViewModelFactory
import com.test.demohilt.HiltDemoApplication
import com.test.demohilt.MainActivity
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector
import dagger.multibindings.Multibinds

@Module(includes = [
    DataModule::class
])
abstract class AppModule {

    @ContributesAndroidInjector
    internal abstract fun bindMainActivity(): MainActivity

    @Binds
    @ActivityContext
    internal abstract fun bindActivityContext(activity: MainActivity): Context

    @Binds
    @ApplicationContext
    internal abstract fun bindApplicationContext(app: HiltDemoApplication): Context

    @Binds
    abstract fun bindViewModelFactory(viewModelFactory: ViewModelFactory): ViewModelProvider.Factory

    @Multibinds
    abstract fun bindViewModels(): Map<Class<out ViewModel>, ViewModel>

}