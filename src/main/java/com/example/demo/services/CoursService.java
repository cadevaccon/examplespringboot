package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import com.example.demo.entities.Cours;

public interface CoursService {
	void saveCours (Cours cours);
	void UpdateCours(Cours cours);
	List<Cours>ListCours();
	void removeCours(Long Id);
	public Optional<Cours> findCours(Long Id);

}
