package com.project.air.repository

import jakarta.persistence.*
import java.time.LocalDateTime
import java.util.*

@Entity(name = "devices")
class DeviceEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    var id: UUID?,
    @Column(name = "name", nullable = true)
    val name: String?,
    @Column(name = "description", nullable = true)
    val description: String?,
    @Column(name = "createdAt", nullable = true)
    val createdAt: LocalDateTime?
)