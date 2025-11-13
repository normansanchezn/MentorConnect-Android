package com.accenture.data.di

import com.accenture.data.repository.AccentureUserRepositoryImpl
import com.accenture.domain.repository.AccentureUserRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModel {

    @Binds
    abstract fun bindAccentureUserRepository(
        accentureUserRepositoryImpl: AccentureUserRepositoryImpl
    ): AccentureUserRepository
}