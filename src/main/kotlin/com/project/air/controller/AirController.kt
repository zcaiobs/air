package com.project.air.controller

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/airs")
class AirController {

    @GetMapping
    fun getAir():ResponseEntity<Any>{
        val airs = mutableListOf("Air1", "Air2", "Air3", "Air4", "Air5")
        return ResponseEntity.ok(airs)
    }
}