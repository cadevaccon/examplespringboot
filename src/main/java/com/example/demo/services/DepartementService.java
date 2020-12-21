package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import com.example.demo.entities.Departement;

public interface DepartementService {
	void saveDepartement (Departement Dep);
	void UpdateDepartement(Departement Dep);
	List<Departement>ListDepartement();
	void removeDepartement(Long Id);
	public Optional<Departement> findDepartement(Long Id);
}
