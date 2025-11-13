package com.accenture.domain.usecase

import com.accenture.domain.repository.AccentureUserRepository
import javax.inject.Inject

class GetAccentureUserTaskListUseCase @Inject constructor(
    private val repository: AccentureUserRepository
) {
    suspend operator fun invoke(userId: String) = repository.getAccentureTaskInfo()
}