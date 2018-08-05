package com.jangsunok.data

import com.jangsunok.domain.Photo
import com.jangsunok.domain.PhotoRepository
import io.reactivex.Observable
import io.reactivex.Single
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

//TODO Cache
class PhotoRepositoryImpl(val photoRestApi: PhotoRestApi,
                          val photoMapper: PhotoMapper) : PhotoRepository {


    override fun photos(): Observable<List<Photo>> {
        return photoRestApi.getPhotoList().map(this.photoMapper::transform)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
    }

    override fun photo(photoId: Int): Single<Photo> {
        return photoRestApi.getPhoto(photoId).map(this.photoMapper::transform)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
    }
}