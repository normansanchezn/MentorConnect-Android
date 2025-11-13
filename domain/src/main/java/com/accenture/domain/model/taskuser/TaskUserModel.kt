package com.accenture.domain.model.taskuser

data class TaskUserModel(
    val createdAt: String?,
    val description: String?,
    val dueDate: String?,
    val feedback: String?,
    val id: String?,
    val isComplete: Boolean?,
    val name: String?,
    val resourceUrl: String?,
    val reviewer: String?
)