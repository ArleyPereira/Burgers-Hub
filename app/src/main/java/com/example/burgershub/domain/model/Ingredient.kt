package com.example.burgershub.domain.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Ingredient(
    val id: Int? = null,
    val name: String? = null,
    val img: String? = null
) : Parcelable
