package com.oraclejava.spring.sample1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	private static ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
	
	
	public static void main(String[] args) {
		SampleBean sampleBean = context.getBean(SampleBean.class);
		System.out.println(sampleBean);
		System.out.println(sampleBean.getFirstBean());
		System.out.println(sampleBean.getSecondBean());

	}

}
