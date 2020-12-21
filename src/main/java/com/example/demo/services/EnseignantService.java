package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import com.example.demo.entities.*;

public interface EnseignantService {
	void saveEnseignant (Enseignant Ens);
	void UpdateEnseignant(Enseignant Ens);
	List<Enseignant>ListEnseignant();
	void removeEnseignant(Long Id);
	public Optional<Enseignant> findEnseignant(Long Id);

}
