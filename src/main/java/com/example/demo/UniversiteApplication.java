package com.example.demo;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.demo.entities.*;
import com.example.demo.repositories.*;

import lombok.NonNull;

@SpringBootApplication
@EnableJpaRepositories("com.example.demo.repositories")
public class UniversiteApplication implements ApplicationRunner {

	@Autowired
	private DepartementRepository DR;
	@Autowired
	private SalleRepository SR;
	@Autowired
	private CoursRepository CR;
	@Autowired
	private EtudiantRepository ER;
	
	public static void main(String[] args) {
		SpringApplication.run(UniversiteApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		
		
		
		
	}

	

}
