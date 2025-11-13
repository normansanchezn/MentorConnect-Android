package com.accenture.data.di

import com.accenture.data.remote.api.ApiService
import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import javax.inject.Singleton
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    private val networkJson = Json { ignoreUnknownKeys = true }

    @Provides
    fun provideBaseUrl(): String {
        return "https://6913ff82f34a2ff1170dc97d.mockapi.io/"
    }

    @Singleton
    @Provides
    fun provideHttpLoggingInterceptor() = HttpLoggingInterceptor().apply {
        level = HttpLoggingInterceptor.Level.BODY
    }

    @Singleton
    @Provides
    fun provideRetrofit(
        baseUrl: String,
        loggingInterceptor: HttpLoggingInterceptor,
    ): Retrofit = Retrofit.Builder()
        .baseUrl(baseUrl)
        .addConverterFactory(networkJson.asConverterFactory("application/json".toMediaType()))
        .client(
            OkHttpClient.Builder()
                .addInterceptor(loggingInterceptor)
                .build()
        )
        .build()

    @Singleton
    @Provides
    fun provideApiService(retrofit: Retrofit): ApiService = retrofit.create(ApiService::class.java)
}