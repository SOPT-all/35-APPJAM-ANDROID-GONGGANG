package com.sopt.gongbaek.di

import com.sopt.gongbaek.domain.repository.ExampleRepository
import com.sopt.gongbaek.domain.usecase.ExamplePostUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {
    @Provides
    @Singleton
    fun provideExamplePostUseCase(
        exampleRepository: ExampleRepository
    ): ExamplePostUseCase = ExamplePostUseCase(exampleRepository)
}
