package com.project.air.util

import com.project.air.domain.Device
import com.project.air.repository.DeviceEntity

object DeviceEntityToDevice {

    fun translate(entity: DeviceEntity): Device {
        return Device(
            entity.id,
            entity.name,
            entity.description,
            entity.createdAt,
        )
    }
}