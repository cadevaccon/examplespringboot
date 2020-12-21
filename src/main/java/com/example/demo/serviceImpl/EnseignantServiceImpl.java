package com.example.demo.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Enseignant;
import com.example.demo.repositories.EnseignantRepository;
import com.example.demo.services.EnseignantService;

@Service("EnseignantServiceImpl")
public class EnseignantServiceImpl implements EnseignantService {
	
	@Autowired
	EnseignantRepository enseignantRepository;

	@Override
	public void saveEnseignant(Enseignant Ens) {
		enseignantRepository.save(Ens);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void UpdateEnseignant(Enseignant Ens) {
		enseignantRepository.save(Ens);
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Enseignant> ListEnseignant() {
		// TODO Auto-generated method stub
		return enseignantRepository.findAll()
;
	}

	@Override
	public void removeEnseignant(Long Id) {
		enseignantRepository.deleteById(Id);
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<Enseignant> findEnseignant(Long Id) {
		// TODO Auto-generated method stub
		return enseignantRepository.findById(Id);
	}

}
