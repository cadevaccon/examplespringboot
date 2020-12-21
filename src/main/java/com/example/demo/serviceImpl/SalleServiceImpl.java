package com.example.demo.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Salle;
import com.example.demo.repositories.SalleRepository;
import com.example.demo.services.SalleService;

@Service("SalleServiceImpl")
public class SalleServiceImpl implements SalleService {

	@Autowired
	SalleRepository salleRepository;
	
	@Override
	public void saveSalle(Salle salle) {
		salleRepository.save(salle);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void UpdateDepartement(Salle salle) {
		salleRepository.save(salle);
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Salle> ListSalle() {
		// TODO Auto-generated method stub
		return salleRepository.findAll();
	}

	@Override
	public void removeSalle(Long Id) {
		salleRepository.deleteById(Id);
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<Salle> findSalle(Long Id) {
		// TODO Auto-generated method stub
		return salleRepository.findById(Id);
	}

}
