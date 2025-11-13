package com.accenture.domain.model.taskuser

data class SendTaskUserModel(
    val id: String?,
    val name: String?,
    val description: String?,
    val dueDate: String?,
    val reviewer: String?,
    val resourceUrl: String?
)