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

import com.example.demo.entities.Departement;
import com.example.demo.entities.Departement;
import com.example.demo.services.DepartementService;

@RestController
@RequestMapping("/departement")
public class DepartementController {
	
	@Autowired
	DepartementService DS;
	
	@PostMapping("/add")
	Departement ajoutdepartement(@RequestBody Departement departement) {
		 DS.saveDepartement(departement);
		 return departement;
	}
	
	@GetMapping("/getalldepartements")
	public List<Departement> getalldepartements()
	{
		return DS.ListDepartement();
	}
	
	@GetMapping("/findbyid/{id}")
	Optional<Departement> finddepartementbyid(@PathVariable("id") Long id)
	{
		return DS.findDepartement(id);
	}
	
	@DeleteMapping("/deletedepartement/{id}")
	void removedepartement(@PathVariable("id") Long id)
	{
		DS.removeDepartement(id);
	}
	
	
	@PutMapping("updatedepartement/{id}")
	String updatedepartement(@RequestBody Departement departement,@PathVariable("id") Long id) {
		
		
		Optional<Departement> DepartementOptional=DS.findDepartement(id);
		if(!DepartementOptional.isPresent())
			return "departement n'existe pas";
		
		Departement D=new Departement();
		D.setCode_Dep(id);
		D.setNom_Dep(departement.getNom_Dep());
		DS.saveDepartement(D);
		return "departement existe";
	}

}
