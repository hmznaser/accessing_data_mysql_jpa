package com.hamzeh.accessingdatamysql;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AccessingDataMysqlApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccessingDataMysqlApplication.class, args);
	}
}

/*
  run:
       mvn spring-boot:run
  
 
  curl localhost:8080/demo/add -d firstName=Anderson -d email=john123@example.com
  
  curl localhost:8080/demo/all
  
  
 */
