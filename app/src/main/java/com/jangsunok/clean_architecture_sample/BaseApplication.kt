package com.jangsunok.clean_architecture_sample

import android.app.Application
import android.content.Context
import com.jangsunok.clean_architecture_sample.di.getApplicationComponent
import com.jangsunok.clean_architecture_sample.di.initializeApplicationComponent


class BaseApplication : Application() {

    private var mInstance: BaseApplication? = null


    override fun onCreate() {
        super.onCreate()
        mInstance = this
        initDagger()
    }

    fun initDagger() {
        initializeApplicationComponent(this)
    }


    fun getInstance(): BaseApplication? {
        return mInstance;
    }

}