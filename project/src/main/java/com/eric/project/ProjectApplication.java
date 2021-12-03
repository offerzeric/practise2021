package com.eric.project;


import com.eric.project.annotation.ImportHelper;
import com.eric.project.pojo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.client.RestTemplate;

import javax.jws.Oneway;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

@SpringBootApplication
@EnableConfigurationProperties(Person.class)
@ImportHelper
public class ProjectApplication {

	@Autowired
	private RestTemplate restTemplate;
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(ProjectApplication.class, args);
		Object appleTest = context.getBean("appleTest");
		Object jedisTest = context.getBean("jedisTest");


	}
}


