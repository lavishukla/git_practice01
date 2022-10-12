package com.nt;

import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.entity.Person;
import com.nt.repository.PlayerRepository;

@SpringBootApplication
public class BootProj1DataJpaApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BootProj1DataJpaApplication.class, args);
		PlayerRepository playerRepo = context.getBean(PlayerRepository.class);
		
		// Inserting data in DB  
		
		Person person = new Person();
		person.setName("Ranjeet");
		person.setSalary(65000.0);
		
		playerRepo.save(person);
		System.out.println("Details Inserted Successfully..!!");
		
		// Retrieving  data from DB 
		
		 Optional<Person> findById = playerRepo.findById(1);
		 if(findById.isPresent()) {
			 System.out.println(findById);
		 } else {
			 System.out.println("Record  not found");
		 }
		 
		((ConfigurableApplicationContext) context).close(); 
	}
}
