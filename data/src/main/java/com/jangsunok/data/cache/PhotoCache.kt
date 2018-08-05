package com.jangsunok.data.cache

import android.arch.persistence.room.Entity

@Entity
data class PhotoCache(var albumId: Int = 0,
                      var id: Int = 0,
                      var title: String? = null,
                      var url: String? = null,
                      var thumbnailUrl: String? = null)
