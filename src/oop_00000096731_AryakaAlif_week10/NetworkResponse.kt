package oop_00000096731_AryakaAlif_week10

data class ApiResponse<T>(
    val status: String,
    val data: T
)