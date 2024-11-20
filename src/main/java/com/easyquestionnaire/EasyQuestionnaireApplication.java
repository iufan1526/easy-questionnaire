package com.easyquestionnaire;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class EasyQuestionnaireApplication {

	public static void main(String[] args) {
		SpringApplication.run(EasyQuestionnaireApplication.class, args);
	}

}
