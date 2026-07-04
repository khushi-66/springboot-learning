package com.isrdc.configs;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.isrdc.intercepters.AppInterceptor;

@Configuration
public class AppConfiguration implements WebMvcConfigurer {

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new AppInterceptor());
		WebMvcConfigurer.super.addInterceptors(registry);
	}

}
