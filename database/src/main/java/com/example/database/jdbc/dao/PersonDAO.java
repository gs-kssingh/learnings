package com.example.database.jdbc.dao;

import com.example.database.jdbc.models.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PersonDAO {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Person> findAll() {
        return jdbcTemplate.query("SELECT * FROM PERSON", new BeanPropertyRowMapper<>(Person.class));
    }
}
