package com.tlm.cicd.springboot_docker_ci_demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/")
    public String demo() {

        String sqlQuery = "select empid, name from employee where id=1";
        return "Hi TLM team, welcome to vulnerability demo";
    }
}
