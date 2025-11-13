package com.accenture.data.dto

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class TaskAssignmentDTO(
    @SerialName("createdAt")
    val createdAt: String,
    @SerialName("description")
    val description: String?,
    @SerialName("dueDate")
    val dueDate: String?,
    @SerialName("feedback")
    val feedback: String?,
    @SerialName("id")
    val id: String?,
    @SerialName("isComplete")
    val isComplete: Boolean,
    @SerialName("name")
    val name: String?,
    @SerialName("resourceUrl")
    val resourceUrl: String?,
    @SerialName("reviewer")
    val reviewer: String
)