package com.example.burgershub.domain.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Burger(
    val id: Int? = null,
    val name: String? = null,
    val images: List<Image>? = null,
    val desc: String? = null,
    val ingredients: List<Ingredient>? = null,
    val price: Float? = null,
    val veg: Boolean? = null
) : Parcelable
