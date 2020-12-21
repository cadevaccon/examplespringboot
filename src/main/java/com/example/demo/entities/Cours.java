package com.example.demo.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
@Entity
@Table(name = "cours")
public class Cours implements Serializable {
	private static final long serialVersionUID=1L;
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Code_C;
	@NonNull
	private String Libelle_C;
	
	@ManyToMany
	@JoinTable(name="cours_etudiant",
	    joinColumns=@JoinColumn(name="Code_C",referencedColumnName ="Code_C"),
	    inverseJoinColumns=@JoinColumn(name ="Num_Insc",referencedColumnName ="num_Insc")
			)
	List<Etudiant> listetudiants;
	
	@OneToMany(mappedBy="cours",cascade =CascadeType.ALL)
	private List<Enseignant> enseignants;
	
	@OneToOne(cascade=CascadeType.ALL)
	private Salle salle;
	

}
