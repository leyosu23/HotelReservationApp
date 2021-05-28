package com.spring.boot;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class YoonseopLeeKevinLiComp303Assignment2Application implements CommandLineRunner{

	@Autowired
	private CustomerRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(YoonseopLeeKevinLiComp303Assignment2Application.class, args);
		System.out.println("Spring Boot MVC JPA app is ready!");
	}

	@Override
    public void run(String... args) throws Exception {
        //repository.save(new Employee(2222,"Jack", "Manager", 34000.50,2));
        
        //Iterable<Employee> iterator = repository.findAll();
         
        //System.out.println("All the Employees: ");
        //iterator.forEach(item -> System.out.println(item));
        
	}
	
}
