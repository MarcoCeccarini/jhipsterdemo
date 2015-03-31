package com.mycompany.myapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mycompany.myapp.domain.Impianto;

/**
 * Spring Data JPA repository for the Contratto entity.
 */
public interface ImpiantoRepository extends JpaRepository<Impianto,Integer> {


	
}
