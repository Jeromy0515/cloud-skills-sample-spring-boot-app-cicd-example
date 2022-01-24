package com.skills.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.skills.cloud.dto.HealthChecker;

@RestController
@SpringBootApplication
public class CloudSkillsSpringBootExamApplication {
	
	@ResponseBody
	@RequestMapping("/health")
	public HealthChecker index() {
		
		HealthChecker healthChecker = new HealthChecker();
		healthChecker.setStatus("ok");
		
		return healthChecker;
	}

	public static void main(String[] args) {
		SpringApplication.run(CloudSkillsSpringBootExamApplication.class, args);
	}

}
