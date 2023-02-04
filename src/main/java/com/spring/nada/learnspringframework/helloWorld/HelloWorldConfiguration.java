package com.spring.nada.learnspringframework.helloWorld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;

record Address (String firstLine, String city) {};
record Person (String name, int age, Address address) {}; // class has constructor getters and setters

public class HelloWorldConfiguration {
	@Bean
	public String name() {
		return "Nada";
	}
	
	@Bean
	public int age() {
		return 25;
	}
	
	@Bean("AddressBeanName")
	public Address address() {
		return new Address("Tunisia", "HG");
	}
	
	@Bean("addressTwo")
	@Primary
	public Address addressTwo() {
		return new Address("Turkey", "HG");
	}
	@Bean(name="Address3")
	@Qualifier("Address3Qualifier")
	public Address addressThree() {
		return new Address("France", "Lile");
	}
	/*@Bean("Person")
	@Primary
	public Person person() {
		return new Person(name(), age(), address());
	}*/
	@Bean
	public Person personParameter(String name, int age, Address AddressBeanName) {
		return new Person(name, age, AddressBeanName);
	}

	@Bean
	public Person personQualifier(String name, int age, @Qualifier("Address3Qualifier") Address address) {
		return new Person(name, age, address);
	}
	
	@Bean("PersonTwo")
	public Person personTwo() {
		return new Person(name(), age(), new Address("Tunisia", "HG"));
	}
}
