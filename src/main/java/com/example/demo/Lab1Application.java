package com.example.demo;

import java.util.*;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repo.TeamRepository;

@SpringBootApplication
public class Lab1Application {
	
	@Autowired TeamRepository teamRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(Lab1Application.class, args);
	}
	
	@PostConstruct
	  public void init() {
	  	List<Team> list = new ArrayList<>();

	  	Set<Player> set = new HashSet<>();
	  	set.add(new Player("Big Easy", "Showman"));
	  	set.add(new Player("Buckets", "Guard"));
	  	set.add(new Player("Dizzy", "Guard"));
	  	
	  	list.add(new Team("Harlem", "Globetrotters", set));
	  	list.add(new Team("Washington","Generals",null));

	  	teamRepository.saveAll(list);
	  } 
}
