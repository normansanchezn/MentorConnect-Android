package com.accenture.data.mapper

import com.accenture.core.mapper.ResultMapper
import com.accenture.data.dto.TaskAssignmentDTO
import com.accenture.domain.model.taskuser.TaskUserModel
import javax.inject.Inject

class TaskUserMapper @Inject constructor()
    : ResultMapper<List<TaskAssignmentDTO>, List<TaskUserModel>> {
    override fun map(input: List<TaskAssignmentDTO>): List<TaskUserModel> = input.filter {
        it.id != null && it.name != null
    }.map {
        it.toModel()
    }

    private fun TaskAssignmentDTO.toModel() = TaskUserModel(
        createdAt = this.createdAt,
        description = this.description,
        dueDate = this.dueDate,
        feedback = this.feedback,
        id = this.id,
        isComplete = this.isComplete,
        name = this.name,
        resourceUrl = this.resourceUrl,
        reviewer = this.reviewer
    )
}