package com.ykw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.boot.orm.jpa.EntityScan;

@SpringBootApplication
@EntityScan("com.ykw.entities")
public class YouknowwhatBeApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(YouknowwhatBeApplication.class, args);
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(YouknowwhatBeApplication.class);
	}
}
