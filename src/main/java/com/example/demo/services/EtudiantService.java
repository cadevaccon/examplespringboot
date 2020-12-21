package com.example.demo.services;

import java.util.List;
import java.util.Optional;
import com.example.demo.entities.*;


public interface EtudiantService {
	void saveEtudiant(Etudiant Etu);
	void UpdateEtudiant(Etudiant Etu);
	public Optional<Etudiant> findEtudiant(Long Id);
	void removeEtudiant(Long Id);
	List<Etudiant> ListEtudiant();
	
	

}
