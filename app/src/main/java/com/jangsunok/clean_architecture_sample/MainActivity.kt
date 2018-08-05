package com.jangsunok.clean_architecture_sample

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.jangsunok.clean_architecture_sample.di.getPhotoComponent
import com.jangsunok.domain.PhotoRepository
import javax.inject.Inject


class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var photoRepository: PhotoRepository


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getPhotoComponent()?.inject(this)
    }


    override fun onResume() {
        super.onResume()

        //TODO : Add items to RecyclerView Adapter
        //photoRepository.photos()
    }
}
