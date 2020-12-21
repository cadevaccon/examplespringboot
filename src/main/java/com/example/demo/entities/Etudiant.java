package com.example.demo.entities;

import java.io.Serializable;
import java.util.*;

import javax.persistence.*;

import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "etudiant")
public class Etudiant implements Serializable {
	private static final long serialVersionUID=1L;
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long num_Insc;
   @NonNull
	private String nom_Etu;
   @NonNull
	private String prenom_Etu;
	Date date_Entree;
	
	@ManyToMany(mappedBy ="etudiants")
	private Collection<Enseignant> enseignants;
	
	@ManyToMany(mappedBy="listetudiants")
	private List<Cours> listCours;
	 
	
	
	

	
	
	
	

}
