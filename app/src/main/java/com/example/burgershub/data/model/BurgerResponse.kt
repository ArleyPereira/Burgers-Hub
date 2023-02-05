package com.example.burgershub.data.model

import com.google.gson.annotations.SerializedName

data class BurgerResponse(
    val id: Int?,
    val name: String?,
    @SerializedName("images")
    val imageResponse: List<ImageResponse>?,
    val desc: String? = null,
    @SerializedName("ingredients")
    val ingredientResponse: List<IngredientResponse>?,
    val price: Float?,
    val veg: Boolean?
)