package com.accenture.data.repository

import com.accenture.core.error.Failure
import com.accenture.core.functional.Either
import com.accenture.data.mapper.AccentureUserMapper
import com.accenture.data.mapper.TaskUserMapper
import com.accenture.data.remote.api.ApiService
import com.accenture.data.remote.handler.safeApiCall
import com.accenture.domain.model.accentureuser.AccentureUserModel
import com.accenture.domain.model.taskuser.TaskUserModel
import com.accenture.domain.repository.AccentureUserRepository
import javax.inject.Inject

class AccentureUserRepositoryImpl @Inject constructor(
    private val apiService: ApiService,
    private val accentureUserMapper: AccentureUserMapper,
    private var taskUserMapper: TaskUserMapper
) : AccentureUserRepository {

    override suspend fun getAccentureUserInfo(): Either<Failure, List<AccentureUserModel>> =
        safeApiCall(
            apiCall = { apiService.getAccentureUserList() },
            mapper = { accentureUserMapper.map(input = it) }
        )

    override suspend fun getAccentureTaskInfo(): Either<Failure, List<TaskUserModel>> =
        safeApiCall(
            apiCall = { apiService.getTaskUsers() },
            mapper = { taskUserMapper.map(it) }
        )
}
