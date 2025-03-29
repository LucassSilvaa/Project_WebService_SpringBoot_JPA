package com.lucas.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.lucas.course.entities.User;
import com.lucas.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TesteConfig implements CommandLineRunner{
	
	@Autowired //após rodar, o próprio spring, vai resolver a dependência e associar uma instância de UserRepository aqui dentro.
	private UserRepository userRepository; //userRepository é o objeto que acessa os dados e nos auxilia a savar os dados no BD.
	
	public void run(String...args) throws Exception{
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456"); 
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456"); 
	
		userRepository.saveAll(Arrays.asList(u1,u2));
	
	}
	

}
