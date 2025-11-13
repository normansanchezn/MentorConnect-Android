package com.accenture.domain.repository

import com.accenture.core.error.Failure
import com.accenture.core.functional.Either
import com.accenture.domain.model.accentureuser.AccentureUserModel
import com.accenture.domain.model.taskuser.TaskUserModel

interface AccentureUserRepository {
    suspend fun getAccentureUserInfo(): Either<Failure, List<AccentureUserModel>>
    suspend fun getAccentureTaskInfo(): Either<Failure, List<TaskUserModel>>
}