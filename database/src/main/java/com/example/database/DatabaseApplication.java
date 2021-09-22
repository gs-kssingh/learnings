package com.example.database;

import com.example.database.jdbc.dao.PersonDAO;
import com.example.database.jdbc.models.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;


@SpringBootApplication
public class DatabaseApplication implements CommandLineRunner {
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	PersonDAO personDao;

	public static void main(String[] args) {
		SpringApplication.run(DatabaseApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("Users in db: {}", personDao.findAll());
		logger.info("User Sohan in db : {}", personDao.findByName("Sohan"));
		logger.info("Inserting 10004 -> {}", personDao.insert(new Person(10004, "Shanit", "Shillong", new Date())));
		logger.info("Update 10003 -> {}", personDao.update(new Person(10003, "Roger", "Guwahati", new Date())));
	}
}
