package com.shop.cafe;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyConfig implements WebMvcConfigurer{
	
//	@Override
//	public void addCorsMappings(CorsRegistry registry) {
//		registry.addMapping("/**")
//		.allowedOrigins("http://localhost:8080/")
//		.allowedMethods("*")
//		.allowedHeaders("*")
//		.allowCredentials(true); //쿠키, 세션 정보도 허용
//	}
	
}
