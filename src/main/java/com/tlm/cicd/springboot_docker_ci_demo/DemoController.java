package com.tlm.cicd.springboot_docker_ci_demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DemoController {
    @Autowired
    JdbcTemplate jdbcTemplate;
    String password = "Admin@123";
    String apikey = "tlm_demo_xxxxxxxxx";
    @GetMapping("/")
    public String demo() {

        return "Hi TLM team, welcome to vulnerability demo";
    }

    @GetMapping("/users")
    public List<Employee> getUsers(String username) {

        String sql = "SELECT * FROM employee WHERE name='" + username + "'";
        System.out.println("sql query to execute : " + sql);
        return jdbcTemplate.query(sql,
                new BeanPropertyRowMapper<>(Employee.class));

    }

    @GetMapping("/emp")
    public List<Employee> getEmployees(String username) {

        String sql = "SELECT * FROM employee WHERE name = ?";

        return  jdbcTemplate.query(
                "SELECT * FROM employee WHERE name = ?",
                new BeanPropertyRowMapper<>(Employee.class),
                username
        );
    }
}


