package com.example.demo.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.entities.*;
import com.example.demo.services.*;

import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins ="*",allowedHeaders="*")
@RestController
@RequestMapping("/salle")
public class SalleController {
	
	@Autowired
	SalleService SS;
	
	@PostMapping("/add")
	Salle ajoutsalle(@RequestBody Salle salle) {
		 SS.saveSalle(salle);
		 return salle;
	}
	
	@GetMapping("/getallsalles")
	public List<Salle> getallsalles()
	{
		return SS.ListSalle();
		
	}
	
	@GetMapping("/findbyid/{id}")
	Optional<Salle> findsallebyid(@PathVariable("id") Long id)
	{
		return SS.findSalle(id);
	}
	
	@DeleteMapping("/deletesalle/{id}")
	void removesalle(@PathVariable("id") Long id)
	{
		SS.removeSalle(id);
	}
	
	
	@PutMapping("/updatesalle/{id}")
	String updatesalle(@RequestBody Salle salle,@PathVariable("id") Long id) {
		
		
		Optional<Salle> SalleOptional=SS.findSalle(id);
		if(!SalleOptional.isPresent())
			return "salle n'existe pas";
		
		Salle S=new Salle();
		S.setNum_S(id);
		S.setNom_S(salle.getNom_S());
		S.setCapacite(salle.getCapacite());
		SS.saveSalle(S);
		return "salle existe";
	}

}
