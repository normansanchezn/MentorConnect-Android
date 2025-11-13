package com.accenture.data.remote.api

import com.accenture.data.dto.AccentureUserDTO
import com.accenture.data.dto.TaskAssignmentDTO
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    companion object {
        const val GET_USERS_ENDPOINT = "/api/v1/accenture-user"
        const val GET_TASK_ENDPOINT = "/api/v1/task-user"
    }

    @GET(GET_USERS_ENDPOINT)
    suspend fun getAccentureUserList(): Response<ArrayList<AccentureUserDTO>>

    @GET(GET_TASK_ENDPOINT)
    suspend fun getTaskUsers(): Response<ArrayList<TaskAssignmentDTO>>
}