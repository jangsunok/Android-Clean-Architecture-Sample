package com.jangsunok.clean_architecture_sample.di

import com.jangsunok.clean_architecture_sample.BaseApplication
import com.jangsunok.clean_architecture_sample.di.component.ApplicationComponent
import com.jangsunok.clean_architecture_sample.di.component.PhotoComponent
import com.jangsunok.clean_architecture_sample.di.module.ApplicationModule
import com.jangsunok.clean_architecture_sample.di.module.NetModule
import com.jangsunok.clean_architecture_sample.di.module.PhotoModule


private var applicationComponent: ApplicationComponent? = null
private var photoComponent: PhotoComponent? = null


fun initializeApplicationComponent(appController: BaseApplication): ApplicationComponent? {
    applicationComponent = DaggerApplicationComponent.builder()
            .applicationModule(ApplicationModule(appController))
            .netModule(NetModule())
            .build()
    return applicationComponent
}


fun getApplicationComponent(): ApplicationComponent? {
    if (applicationComponent == null && BaseApplication().getInstance() != null) {
        initializeApplicationComponent(BaseApplication().getInstance()!!)
    }
    return applicationComponent
}

fun getPhotoComponent(): PhotoComponent? {
    if (photoComponent == null) {
        photoComponent = DaggerPhotoComponent.builder()
                .applicationComponent(getApplicationComponent())
                .userModule(PhotoModule())
                .build()
    }
    return photoComponent
}
