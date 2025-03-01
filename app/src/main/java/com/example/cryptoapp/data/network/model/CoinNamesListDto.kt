package com.example.cryptoapp.data.network.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class CoinNamesListDto (
    @SerializedName("Names")
    @Expose
    val names: List<CoinNameContainerDto>? = null
)
