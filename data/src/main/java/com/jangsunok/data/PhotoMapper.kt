package com.jangsunok.data

import com.jangsunok.data.cache.PhotoCache
import com.jangsunok.domain.Photo

class PhotoMapper {

    fun transform(entities: List<PhotoEntity>): List<Photo> {
        var list = ArrayList<Photo>()
        entities.forEach {
            list.add(transform(it))
        }
        return list
    }


    fun transform(entity: PhotoEntity): Photo {
        return Photo(albumId = entity.albumId,
                id = entity.id,
                title = entity.title,
                url = entity.url,
                thumbnailUrl = entity.thumbnailUrl)

    }



    fun transform(cache: PhotoCache): PhotoEntity {
        return PhotoEntity(albumId = cache.albumId,
                id = cache.id,
                title = cache.title,
                url = cache.url,
                thumbnailUrl = cache.thumbnailUrl)

    }


}
