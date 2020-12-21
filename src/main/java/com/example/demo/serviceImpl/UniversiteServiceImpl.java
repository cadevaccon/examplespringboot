package com.example.demo.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Universite;
import com.example.demo.repositories.UniversiteRepository;
import com.example.demo.services.UniversiteService;

@Service("UniversiteServiceImpl")
public class UniversiteServiceImpl implements UniversiteService {

	@Autowired
	UniversiteRepository universiteRepository;
	
	@Override
	public void saveUniversite(Universite Uni) {
		universiteRepository.save(Uni);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void UpdateUniversite(Universite Uni) {
		universiteRepository.save(Uni);
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Universite> ListUniversite() {
		// TODO Auto-generated method stub
		return universiteRepository.findAll();
	}

	@Override
	public void removeUniversite(Long Id) {
		universiteRepository.deleteById(Id);
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<Universite> findUniversite(Long Id) {
		// TODO Auto-generated method stub
		return universiteRepository.findById(Id);
	}

}
