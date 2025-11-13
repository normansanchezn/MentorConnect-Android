package com.accenture.domain.model.accentureuser

data class AccentureUserInfoModel(
    val id: String?,
    val name: String?,
    val lastName: String?,
    val email: String?,
    val gender: String?,
    val image: String?,
    val jobTitle: String?,
    val jobType: String?,
    val jobDescription: String?
)