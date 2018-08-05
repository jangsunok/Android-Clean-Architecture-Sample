package com.jangsunok.clean_architecture_sample.di.module

import com.jangsunok.clean_architecture_sample.BaseApplication
import com.mathpresso.baseapp.tools.ContextUtils
import com.mathpresso.qanda.AppController
import com.mathpresso.qanda.data.*
import com.mathpresso.qanda.data.cache.LocalStore

import javax.inject.Singleton

import dagger.Module
import dagger.Provides
import io.realm.Realm

@Module
class ApplicationModule(private val context: BaseApplication) {

    @Provides
    @Singleton
    fun provideApplicationContext(): BaseApplication = context


}
