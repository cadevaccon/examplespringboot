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
@RequestMapping("/enseignant")
public class EnseignantController {
	
	@Autowired
	EnseignantService ES;
	
	@PostMapping("/add")
	Enseignant ajoutenseignant(@RequestBody Enseignant enseignant) {
		 ES.saveEnseignant(enseignant);
		 return enseignant;
	}
	
	@GetMapping("/getallenseignants")
	public List<Enseignant> getallenseignants()
	{
		return ES.ListEnseignant();
		
	}

	@GetMapping("/findbyid/{id}")
	Optional<Enseignant> findenseignantbyid(@PathVariable("id") Long id)
	{
		return ES.findEnseignant(id);
	}
	
	@DeleteMapping("/deleteenseignant/{id}")
	void removeenseignant(@PathVariable("id") Long id)
	{
		ES.removeEnseignant(id);
	}
	
	@PutMapping("/updateenseignant/{id}")
	void updateenseignant(@RequestBody Enseignant enseignant,@PathVariable("id") Long id) {
		
		
		Optional<Enseignant> EnseignantOptional=ES.findEnseignant(id);
		if(EnseignantOptional.isPresent())
		{	
		Enseignant E=new Enseignant();
		E.setMatricule(id);
		E.setNom_Ens(enseignant.getNom_Ens());
		E.setPrenom_Ens(enseignant.getPrenom_Ens());
		ES.UpdateEnseignant(E);
		}
	}
}
