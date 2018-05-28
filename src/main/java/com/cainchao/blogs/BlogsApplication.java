package com.cainchao.blogs;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 博客项目
 */
@SpringBootApplication
public class BlogsApplication {

	private static final Logger LOGGER = Logger.getLogger(BlogsApplication.class.getSimpleName());


	public static void main(String[] args) {
		SpringApplication.run(BlogsApplication.class, args);
		LOGGER.log(Level.INFO,"--------blog---run--------success");
	}
}
