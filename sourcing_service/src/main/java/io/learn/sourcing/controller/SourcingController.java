package io.learn.sourcing.controller;

import io.learn.sourcing.service.SourcingService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@CrossOrigin(origins = "*")
@RestController
@RequestMapping(path = "/api/v1/sourcing")
public class SourcingController {

    private final SourcingService sourcingService;

    @GetMapping(path = "/test")
    public void jsoup() {

    }
}
