package com.example.demo.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Etudiant;
import com.example.demo.repositories.EtudiantRepository;
import com.example.demo.services.EtudiantService;

@Service ("EtudiantServiceImpl")
public class EtudiantServiceImpl implements EtudiantService {
	
	@Autowired
	EtudiantRepository etudiantrepository;

	@Override
	public void saveEtudiant(Etudiant Etu) {
		etudiantrepository.save(Etu);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void UpdateEtudiant(Etudiant Etu) {
		etudiantrepository.save(Etu);
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Etudiant> ListEtudiant() {
		// TODO Auto-generated method stub
		return etudiantrepository.findAll();
	}

	@Override
	public void removeEtudiant(Long Id) {
		etudiantrepository.deleteById(Id);
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<Etudiant> findEtudiant(Long Id) {
		// TODO Auto-generated method stub
		return etudiantrepository.findById(Id);
	}

}
