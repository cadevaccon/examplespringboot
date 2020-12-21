package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import com.example.demo.entities.*;

public interface SalleService {
	void saveSalle (Salle salle);
	void UpdateDepartement(Salle salle);
	List<Salle>ListSalle();
	void removeSalle(Long Id);
	public Optional<Salle> findSalle(Long Id);

}
