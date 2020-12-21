package com.example.demo.entities;

import java.io.Serializable;

import javax.persistence.*;

import java.util.*;

import javax.persistence.*;

import lombok.*;
@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "departement")
public class Departement implements Serializable {
	
private static final long serialVersionUID=1L;
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long code_Dep;
	@NonNull
	private String nom_Dep;
	
	@OneToMany(mappedBy = "departement")
	private Collection<Enseignant> enseignants;
	
	@ManyToOne
	@JoinColumn(name ="code_univ")
	private Universite universite;
	
	
	
	

}