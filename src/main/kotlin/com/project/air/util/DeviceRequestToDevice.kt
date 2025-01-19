package com.project.air.util

import com.project.air.controller.DeviceRequest
import com.project.air.domain.Device

object DeviceRequestToDevice {

    fun translate(request: DeviceRequest): Device {
        return Device(
            name = request.name,
            description = request.description
        )
    }
}