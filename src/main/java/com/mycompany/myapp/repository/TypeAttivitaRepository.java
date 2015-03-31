package com.mycompany.myapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.mycompany.myapp.domain.Contratto;
import com.mycompany.myapp.domain.Typeattivita;
import com.mycompany.myapp.domain.Typeconsistenza;
import com.mycompany.myapp.domain.Typeimpianto;
import com.mycompany.myapp.domain.Typeintervento;

/**
 * Spring Data JPA repository for the Contratto entity.
 */
public interface TypeAttivitaRepository extends JpaRepository<Typeattivita,Integer> {

	@Query("SELECT tatt FROM Typeattivita tatt "
			+ "WHERE tatt.typeAttivitaId = :id")
 	public Typeattivita findById(@Param("id") Integer id);
	
	
	public List<Typeattivita> findByTypeintervento(Typeintervento typeIintervento);
	
}
