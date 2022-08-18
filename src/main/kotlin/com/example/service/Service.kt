package com.example.service

import com.example.dto.BodyDto
import jakarta.inject.Singleton

@Singleton
class Service {

    fun asString(bodyDto: BodyDto): String {
        return bodyDto.length as String
    }
}