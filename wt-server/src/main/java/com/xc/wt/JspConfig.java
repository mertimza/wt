package com.xc.wt;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
public class JspConfig extends WebMvcConfigurerAdapter {
	@Bean
	public InternalResourceViewResolver getResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		return resolver;
	}

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/**").addResourceLocations(".");
	}

}
