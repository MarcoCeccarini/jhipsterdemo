package com.mycompany.myapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mycompany.myapp.domain.Intervento;

/**
 * Spring Data JPA repository for the Contratto entity.
 */
public interface InterventoRepository extends JpaRepository<Intervento,Integer> {


	
}
