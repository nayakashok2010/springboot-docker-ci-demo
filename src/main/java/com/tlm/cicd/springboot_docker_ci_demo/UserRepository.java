package com.tlm.cicd.springboot_docker_ci_demo;

@Repository
public class UserRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<User> searchUser(String username) {

        String sql = "SELECT * FROM users WHERE username = '" + username + "'";
        System.out.println(sql);
        return jdbcTemplate.query(sql,
                new BeanPropertyRowMapper<>(User.class));
    }
}
