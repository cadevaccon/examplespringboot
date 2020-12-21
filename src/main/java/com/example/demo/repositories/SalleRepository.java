package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Salle;

@Repository
public interface SalleRepository extends JpaRepository< Salle, Long>  {

}
