package com.example.demo.serviceImpl;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Departement;
import com.example.demo.repositories.DepartementRepository;
import com.example.demo.services.DepartementService;

@Service("DepartementServiceImpl")
public class DepartementServiceImpl implements DepartementService{
	@Autowired
	DepartementRepository departementRepository;

	@Override
	public void saveDepartement(Departement Dep) {
		departementRepository.save(Dep);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void UpdateDepartement(Departement Dep) {
		departementRepository.save(Dep);
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Departement> ListDepartement() {
		// TODO Auto-generated method stub
		return departementRepository.findAll();
	}

	@Override
	public void removeDepartement(Long Id) {
		departementRepository.deleteById(Id);
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<Departement> findDepartement(Long Id) {
		// TODO Auto-generated method stub
		return departementRepository.findById(Id);
	}

}
