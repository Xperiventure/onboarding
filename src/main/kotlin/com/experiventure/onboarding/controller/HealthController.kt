package com.experiventure.onboarding.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HealthController {

    @GetMapping("/health")
    fun getHealth(): String {
        return "Hello world22";
    }
}