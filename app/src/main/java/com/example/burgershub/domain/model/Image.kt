package com.example.burgershub.domain.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Image(
    val sm: String?,
    val lg: String?
) : Parcelable