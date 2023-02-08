package com.spring.nada.learnspringframework.helloWorld;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppHelloWorldSpring {

	public static void main(String[] args) {
		try(//1: lunch a Spring Context
				var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class)){
			//2: Configure the things that we want Spring to manage - by creating HelloWorldConfiguration Class @Configuration 
			//create a bean method name @Bean
			//retrieving a bean manage by spring
			//logger.info(context.getBean(Person.class)); //error : multiple beans found
			//logger.info(context.getBean("personParameter"));
			
			System.out.println(context.getBean("personQualifier"));
			
			//Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
	}

}
	
	
	
}
