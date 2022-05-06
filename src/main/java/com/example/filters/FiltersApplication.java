package com.example.filters;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

@SpringBootApplication
@RestController
public class FiltersApplication {

	public static void main(String[] args) throws SQLException {
		Connection connection =
				DriverManager.getConnection("jdbc:mysql://localhost/?user=root");
		Statement stmt = connection.createStatement();
		stmt.executeUpdate("CREATE DATABASE IF NOT EXISTS filter");

		SpringApplication.run(FiltersApplication.class, args);
	}


}
