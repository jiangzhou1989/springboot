package com.springboot;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringbootLogbackApplication {
	public static Logger log = Logger.getLogger(SpringbootLogbackApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringbootLogbackApplication.class, args);
	}
//	
//	@RequestMapping("/")
//	public String index(){
//		log.info("info...hello");
//		return "log..";
//	}
}
