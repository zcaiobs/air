package com.project.air.util

import com.project.air.domain.Device
import com.project.air.repository.DeviceEntity

object DeviceToDeviceEntity {

    fun translate(domain: Device): DeviceEntity {
        return DeviceEntity(
            domain.id,
            domain.name,
            domain.description,
            domain.createdAt,
        )
    }
}