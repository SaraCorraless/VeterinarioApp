package com.cys.veterinarioapp

import android.icu.text.CaseMap
import androidx.annotation.DrawableRes

class NewsVeterinario(
    val id:Long,
    @DrawableRes
    val image:Int?,
    val title: String,
    val resume:String
)
