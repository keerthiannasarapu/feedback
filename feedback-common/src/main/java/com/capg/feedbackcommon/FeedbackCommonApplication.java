package com.capg.feedbackcommon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.capg.feedbackcommon")
public class FeedbackCommonApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeedbackCommonApplication.class, args);
	}
}
