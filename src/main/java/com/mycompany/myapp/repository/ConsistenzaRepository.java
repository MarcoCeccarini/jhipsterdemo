package com.mycompany.myapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mycompany.myapp.domain.Consistenza;

/**
 * Spring Data JPA repository for the Contratto entity.
 */
public interface ConsistenzaRepository extends JpaRepository<Consistenza,Integer> {


	
}
