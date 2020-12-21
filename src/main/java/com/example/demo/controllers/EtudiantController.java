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
import com.example.demo.entities.*;
import com.example.demo.services.*;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins ="*",allowedHeaders="*")
@RestController
@RequestMapping("/etudiant")
public class EtudiantController {
	

	@Autowired
	EtudiantService ES;
	
	@PostMapping("/add")
	Etudiant ajoutetudiant(@RequestBody Etudiant etudiant) {
		 ES.saveEtudiant(etudiant);
		 
		 return etudiant;
	}
	
	@GetMapping("/getalletudiants")
	public List<Etudiant> getalletudiants()
	{
		return ES.ListEtudiant();
		
	}

	@GetMapping("/findbyid/{id}")
	Optional<Etudiant> findetudiantbyid(@PathVariable("id") Long id)
	{
		return ES.findEtudiant(id);
	}
	
	@DeleteMapping("/deleteetudiant/{id}")
	void removeetudiant(@PathVariable("id") Long id)
	{
		ES.removeEtudiant(id);

	}
	
	@PutMapping("/updateetudiant/{id}")
	String updateetudiant(@RequestBody Etudiant etudiant,@PathVariable("id") Long id) {
		
		
		Optional<Etudiant> EtudiantOptional=ES.findEtudiant(id);
		if(!EtudiantOptional.isPresent())
			return "Etudiant n'existe pas";
		
		Etudiant E=new Etudiant();
		E.setNum_Insc(id);
		E.setNom_Etu(etudiant.getNom_Etu());
		E.setPrenom_Etu(etudiant.getPrenom_Etu());
		ES.UpdateEtudiant(E);
		return "Etudiant existe";

	}
}
