package com.example.animania


import com.google.gson.annotations.SerializedName

data class TopAnime(
    @SerializedName("API_DEPRECATION")
    val aPIDEPRECATION: Boolean,
    @SerializedName("API_DEPRECATION_DATE")
    val aPIDEPRECATIONDATE: String,
    @SerializedName("API_DEPRECATION_INFO")
    val aPIDEPRECATIONINFO: String,
    @SerializedName("request_cache_expiry")
    val requestCacheExpiry: Int,
    @SerializedName("request_cached")
    val requestCached: Boolean,
    @SerializedName("request_hash")
    val requestHash: String,
    @SerializedName("top")
    val top: List<Result>
)