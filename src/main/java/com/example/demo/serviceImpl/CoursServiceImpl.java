package com.example.demo.serviceImpl;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Cours;
import com.example.demo.repositories.CoursRepository;
import com.example.demo.services.CoursService;

@Service("CoursServiceImpl")
public class CoursServiceImpl implements CoursService {

	@Autowired
	CoursRepository coursrepository;
	
	@Override
	public void saveCours(Cours cours) {
		coursrepository.save(cours);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void UpdateCours(Cours cours) {
		coursrepository.save(cours);
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Cours> ListCours() {
		// TODO Auto-generated method stub
		return 	coursrepository.findAll();
	}

	@Override
	public void removeCours(Long Id) {
		coursrepository.deleteById(Id);
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<Cours> findCours(Long Id) {
		// TODO Auto-generated method stub
		return coursrepository.findById(Id);
	}

}
