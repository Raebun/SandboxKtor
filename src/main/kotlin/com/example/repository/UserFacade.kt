package com.example.repository

import com.example.dto.UserDto
import com.example.dto.UserRegisterDto
import com.example.dto.UserSignInDto

interface UserFacade {
    suspend fun registerUser(user: UserRegisterDto): Int?
    suspend fun allUsers(): List<UserDto>
    suspend fun signInUser(user: UserSignInDto): UserDto?
}