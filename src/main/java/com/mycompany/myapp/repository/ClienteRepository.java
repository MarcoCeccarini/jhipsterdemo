package com.mycompany.myapp.repository;

import com.mycompany.myapp.domain.Cliente;
import com.mycompany.myapp.domain.Contratto;

import org.springframework.data.jpa.repository.*;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Spring Data JPA repository for the Cliente entity.
 */
public interface ClienteRepository extends JpaRepository<Cliente,Long> {
	
	@Query("SELECT c FROM Cliente c LEFT JOIN FETCH c.contrattos contr WHERE c.id = :id")
 	public Cliente findById(@Param("id") Long id);

}
