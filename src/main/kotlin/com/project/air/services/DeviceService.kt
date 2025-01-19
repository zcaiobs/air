package com.project.air.services

import com.project.air.domain.Device
import com.project.air.repository.DeviceRepository
import com.project.air.util.DeviceEntityToDevice
import com.project.air.util.DeviceToDeviceEntity
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class DeviceService {

    @Autowired
    lateinit var deviceRepository: DeviceRepository

    fun getDevices(): List<Device> {
        val result = deviceRepository.findAll().map { DeviceEntityToDevice.translate(it) }
        return result
    }

    fun createDevice(device: Device): Device {
        val result = deviceRepository.save(DeviceToDeviceEntity.translate(device))
        return DeviceEntityToDevice.translate(result)
    }
}