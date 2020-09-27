package com.test.demohilt.di

import com.ankitsharma.punkbeers.di.AppModule
import com.test.demohilt.HiltDemoApplication
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Component(
    modules = [
        AndroidSupportInjectionModule::class,
        AppModule::class
    ]
)
@Singleton
interface AppComponent: AndroidInjector<HiltDemoApplication> {

    @Component.Factory
    abstract class Builder: AndroidInjector.Factory<HiltDemoApplication>

}