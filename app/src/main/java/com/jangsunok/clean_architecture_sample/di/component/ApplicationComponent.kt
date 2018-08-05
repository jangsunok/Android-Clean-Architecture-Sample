package com.jangsunok.clean_architecture_sample.di.component

import com.jangsunok.clean_architecture_sample.BaseApplication
import com.jangsunok.clean_architecture_sample.di.module.ApplicationModule
import com.jangsunok.clean_architecture_sample.di.module.NetModule
import dagger.Component
import javax.inject.Singleton

/**
 * Created by jang on 2017. 7. 22..
 */


@Singleton
@Component(modules = [ApplicationModule::class, NetModule::class])
interface ApplicationComponent {

    fun inject(application: BaseApplication)
}