package com.jangsunok.clean_architecture_sample.di.component

import com.jangsunok.clean_architecture_sample.MainActivity
import com.jangsunok.clean_architecture_sample.di.PerActivity
import com.jangsunok.clean_architecture_sample.di.module.PhotoModule
import dagger.Component

/**
 * Created by Mathpresso on 2017-09-29.
 */

@PerActivity
@Component(dependencies = [ApplicationComponent::class], modules = [PhotoModule::class])
interface PhotoComponent {
    fun inject(mainActivity: MainActivity)
}
