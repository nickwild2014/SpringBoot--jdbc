package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;


@SpringBootApplication
public class SpringBootJdbcApplication implements CommandLineRunner {

	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootJdbcApplication.class, args);
		
	}
	
	@Autowired
    JdbcTemplate jdbcTemplate;
    
	@Override
    public void run(String... strings) throws Exception {
        jdbcTemplate.execute("DROP TABLE customers");
		jdbcTemplate.execute("CREATE TABLE \"HR\".\"CUSTOMERS\"  (	\"CUSTOMER_ID\" NUMBER(10,0) NOT NULL ENABLE,  	\"CUSTOMER_NAME\" VARCHAR2(50 BYTE) NOT NULL ENABLE,  	\"CITY\" VARCHAR2(50 BYTE) )");
    }
}
