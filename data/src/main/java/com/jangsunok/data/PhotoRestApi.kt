package com.jangsunok.data

import com.jangsunok.domain.Photo
import io.reactivex.Observable
import io.reactivex.Single
import retrofit2.adapter.rxjava2.Result
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query
import retrofit2.http.QueryMap

interface PhotoRestApi {

    @GET("/photos")
    fun getPhotoList(): Observable<List<PhotoEntity>>

    @GET("/photos")
    fun getPhotoList(@Query("_limit") limit: Int?,
                     @Query("_page") page: Int?): Observable<List<PhotoEntity>>


    @GET("/photos/{photo_id}")
    fun getPhoto(@Path("photo_id") photo_id: Int?): Single<PhotoEntity>


}