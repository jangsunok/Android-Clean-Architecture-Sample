package com.jangsunok.clean_architecture_sample.di.module


import com.jangsunok.clean_architecture_sample.di.PerActivity
import com.jangsunok.data.PhotoMapper
import com.jangsunok.data.PhotoRepositoryImpl
import com.jangsunok.data.PhotoRestApi
import com.jangsunok.domain.PhotoRepository
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit

@Module
class PhotoModule {

    @Provides
    @PerActivity
    fun providePhotoRestApi(retrofit: Retrofit): PhotoRestApi {
        return retrofit.create(PhotoRestApi::class.java)
    }

    @Provides
    @PerActivity
    fun providePhotoMapper(): PhotoMapper {
        return PhotoMapper()
    }

    @Provides
    @PerActivity
    fun providePhotoRepository(photoRestApi: PhotoRestApi, photoMapper: PhotoMapper): PhotoRepository {
        return PhotoRepositoryImpl(photoRestApi, photoMapper)
    }

}
