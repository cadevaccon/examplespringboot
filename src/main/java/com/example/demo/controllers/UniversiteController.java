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
@RequestMapping("/universite")
public class UniversiteController {
	
	@Autowired
	UniversiteService US;
	
	@PostMapping("/add")
	Universite ajoutuniversite(@RequestBody Universite universite) {
		 US.saveUniversite(universite);
		 return universite;
	}
	
	@GetMapping("/getalluniversites")
	public List<Universite> getalluniversites()
	{
		return US.ListUniversite();
		
	}
	
	@GetMapping("/findbyid/{id}")
	Optional<Universite> finduniversitebyid(@PathVariable("id") Long id)
	{
		return US.findUniversite(id);
	}
	
	@DeleteMapping("/deleteuniversite/{id}")
	void removeuniversite(@PathVariable("id") Long id)
	{
		US.removeUniversite(id);
	}
	
	
	@PutMapping("updateuniversite/{id}")
	String updateuniversite(@RequestBody Universite universite,@PathVariable("id") Long id) {
		
		
		Optional<Universite> UniversiteOptional=US.findUniversite(id);
		if(!UniversiteOptional.isPresent())
			return "universite n'existe pas";
		
		Universite U=new Universite();
		U.setCode_UNV(id);
		U.setNom_UNV(universite.getNom_UNV());
		U.setAdresse_site(universite.getAdresse_site());
		US.saveUniversite(U);
		return "universite existe";
	}

}
