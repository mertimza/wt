package com.xc.wt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@ComponentScan
@EnableAutoConfiguration
public class Starter {
	public static void main(String[] args) throws Exception {
		SpringApplication.run(Starter.class, args);
	}
}
