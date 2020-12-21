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
@Entity
@Table(name = "universite")
public class Universite implements Serializable {
private static final long serialVersionUID=1L;
@Id 
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long code_UNV;
@NonNull
private String nom_UNV;
@NonNull
private String adresse_site;

@OneToMany(mappedBy="universite")
private List<Departement> departements;
}
