package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import com.example.demo.entities.*;

public interface UniversiteService {
	void saveUniversite (Universite Uni);
	void UpdateUniversite(Universite Uni);
	List<Universite>ListUniversite();
	void removeUniversite(Long Id);
	public Optional<Universite> findUniversite(Long Id);

}
