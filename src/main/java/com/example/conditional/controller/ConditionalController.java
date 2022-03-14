package com.example.conditional.controller;

import com.example.conditional.profile.SystemProfile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ConditionalController {
    private SystemProfile profile;

    public ConditionalController(SystemProfile profile) {
        this.profile = profile;
    }

    @GetMapping("/")
    public String getProfile() {
        return profile.getProfile();
    }
}
