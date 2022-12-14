package com.idat.microservicio1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.microservicio1.model.Turista;

@Repository
public interface TuristaRepository extends JpaRepository<Turista, Integer> {

}
