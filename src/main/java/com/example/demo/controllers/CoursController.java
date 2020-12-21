package com.example.demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Cours;
import com.example.demo.services.CoursService;

@RestController
@RequestMapping("/cours")
public class CoursController {
	
	@Autowired
	CoursService CS;
	
	
	@PostMapping("/add")
	Cours ajoutcours(@RequestBody Cours cours) {
		 CS.saveCours(cours);
		 return cours;
	}
	
	@GetMapping("/getallcours")
	public List<Cours> getallcours()
	{
		return CS.ListCours();
	}
	
	@GetMapping("/findbyid/{id}")
	Optional<Cours> findcoursbyid(@PathVariable("id") Long id)
	{
		return CS.findCours(id);
	}
	
	@DeleteMapping("/deletecours/{id}")
	void removecours(@PathVariable("id") Long id)
	{
		CS.removeCours(id);
	}
	
	
	@PutMapping("updatecours/{id}")
	String updatecours(@RequestBody Cours cours,@PathVariable("id") Long id) {
		
		
		Optional<Cours> CoursOptional=CS.findCours(id);
		if(!CoursOptional.isPresent())
			return "cours n'existe pas";
		
		Cours c=new Cours();
		c.setCode_C(id);
		c.setLibelle_C(cours.getLibelle_C());
		CS.saveCours(c);
		return "cours existe";
	}
	
	

}
