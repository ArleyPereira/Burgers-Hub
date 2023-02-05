package com.example.burgershub.domain.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Burger(
    val id: Int?,
    val name: String?,
    val image: List<Image>?,
    val desc: String?,
    val ingredient: List<Ingredient>?,
    val price: Float?,
    val veg: Boolean?
) : Parcelable
