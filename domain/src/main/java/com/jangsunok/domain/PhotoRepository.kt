package com.jangsunok.domain

import io.reactivex.Observable
import io.reactivex.Single


interface PhotoRepository {

    fun photos(): Observable<List<Photo>>

    fun photo(photoId: Int): Single<Photo>
}
