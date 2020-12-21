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
@Table(name = "salle")
public class Salle implements Serializable {
	private static final long serialVersionUID=1L;
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Num_S;
	@NonNull
	private String Nom_S;
	@NonNull
	private int Capacite;
	
	@OneToOne(mappedBy="salle")
	private Cours cours_Salle;
	
	
	
}
