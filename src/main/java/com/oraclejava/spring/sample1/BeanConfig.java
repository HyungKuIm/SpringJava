package com.oraclejava.spring.sample1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

	@Autowired
	private FirstBean firstBean;
	
	@Autowired
	private SecondBean secondBean;
	
	@Bean
	public FirstBean firstBean() {
		return new FirstBean();
	}
	
	@Bean
	public SecondBean secondBean() {
		return new SecondBean();
	}
	
	
	@Bean
	public SampleBean sampleBean() {
		return new SampleBean(firstBean, secondBean);
	}
}
