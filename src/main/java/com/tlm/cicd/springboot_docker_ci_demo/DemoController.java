package com.tlm.cicd.springboot_docker_ci_demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/")
    public String demo() {
        return "Hi TLM team, welcome to demo";
    }
}
