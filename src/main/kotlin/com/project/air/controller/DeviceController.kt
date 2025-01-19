package com.project.air.controller

import com.project.air.services.DeviceService
import com.project.air.util.DeviceRequestToDevice
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/devices")
class DeviceController {

    @Autowired
    lateinit var deviceService: DeviceService

    @GetMapping
    fun getDevices():ResponseEntity<Any>{
        val result = deviceService.getDevices()
        return ResponseEntity.ok(result)
    }

    @PostMapping
    fun createDevice(@RequestBody request: DeviceRequest): ResponseEntity<Any> {
        val result = deviceService.createDevice(DeviceRequestToDevice.translate(request))
        return ResponseEntity.ok(result)
    }
}