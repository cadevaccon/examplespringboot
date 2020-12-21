package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Departement;

@Repository
public interface DepartementRepository  extends JpaRepository<Departement, Long> {

}
