package com.example.otomotif.data

import com.example.otomotif.R
import com.example.otomotif.model.Otomotif

class Datasource {
    fun loadOtomotif(): List<Otomotif> {
        return listOf<Otomotif>(
            Otomotif(R.string.otomotif1, R.drawable.image1),
            Otomotif(R.string.otomotif2, R.drawable.image2),
            Otomotif(R.string.otomotif3, R.drawable.image3),
            Otomotif(R.string.otomotif4, R.drawable.image4),
            Otomotif(R.string.otomotif5, R.drawable.image5),
            Otomotif(R.string.otomotif6, R.drawable.image6),
            Otomotif(R.string.otomotif7, R.drawable.image7),
            Otomotif(R.string.otomotif8, R.drawable.image8),
            Otomotif(R.string.otomotif9, R.drawable.image9),
            Otomotif(R.string.otomotif10, R.drawable.image10)
        )
    }
}