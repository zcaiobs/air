package com.project.air.domain

import java.time.LocalDateTime
import java.util.UUID

class Device(
    val id: UUID? = null,
    val name: String? = null,
    val description: String? = null,
    var createdAt: LocalDateTime? = LocalDateTime.now()
)