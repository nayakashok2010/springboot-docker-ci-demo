package com.tlm.cicd.springboot_docker_ci_demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DemoController {
    @Autowired
    JdbcTemplate jdbcTemplate;
    String password = "Admin@123";
    String apiKey = "sk_live_xxxxxxxxx";
    @GetMapping("/")
    public String demo() {

        String sqlQuery = "select empid, name from employee where id=1";
        return "Hi TLM team, welcome to vulnerability demo";
    }

    @GetMapping("/users")
    public List<User> getUsers(String username) {

        String sql = "SELECT * FROM users WHERE username='" + username + "'";

        return jdbcTemplate.query(sql,
                new BeanPropertyRowMapper<>(User.class));
    }
}
