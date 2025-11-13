package com.accenture.data.dto

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class AccentureUserDTO(
    @SerialName("capabilityLead")
    val capabilityLead: String,
    @SerialName("createdAt")
    val createdAt: String,
    @SerialName("email")
    val email: String,
    @SerialName("gender")
    val gender: String,
    @SerialName("id")
    val id: String?,
    @SerialName("image")
    val image: String?,
    @SerialName("initiativeLead")
    val initiativeLead: String?,
    @SerialName("jobDescription")
    val jobDescription: String,
    @SerialName("jobTitle")
    val jobTitle: String,
    @SerialName("jobType")
    val jobType: String,
    @SerialName("lastName")
    val lastName: String?,
    @SerialName("name")
    val name: String?,
    @SerialName("peopleLead")
    val peopleLead: String?
)