package com.example.affirmations.data

import com.example.affirmations.R
import com.example.affirmations.model.Affirmation

class Datasource {
    fun loadAffirmations(): List<Affirmation> {
        return listOf<Affirmation>(
            Affirmation(R.string.aff1, R.drawable.image1),
            Affirmation(R.string.aff2, R.drawable.image2),
            Affirmation(R.string.aff3, R.drawable.image3),
            Affirmation(R.string.aff4, R.drawable.image4),
            Affirmation(R.string.aff5, R.drawable.image5),
            Affirmation(R.string.aff6, R.drawable.image6),
            Affirmation(R.string.aff7, R.drawable.image7),
            Affirmation(R.string.aff8, R.drawable.image8),
            Affirmation(R.string.aff9, R.drawable.image9),
            Affirmation(R.string.aff10, R.drawable.image10)
        )
    }
}