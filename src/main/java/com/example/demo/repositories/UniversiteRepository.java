package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Universite;

@Repository
public interface UniversiteRepository extends JpaRepository<Universite, Long> {

}
