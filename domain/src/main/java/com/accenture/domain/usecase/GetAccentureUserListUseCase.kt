package com.accenture.domain.usecase

import com.accenture.domain.repository.AccentureUserRepository
import javax.inject.Inject

class GetAccentureUserListUseCase @Inject constructor(
    val repository: AccentureUserRepository
) {
    suspend operator fun invoke() = repository.getAccentureUserInfo()
}