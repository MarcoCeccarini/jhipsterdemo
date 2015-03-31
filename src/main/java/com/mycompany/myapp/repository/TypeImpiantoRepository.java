package com.mycompany.myapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.mycompany.myapp.domain.Typeconsistenza;
import com.mycompany.myapp.domain.Typeimpianto;
import com.mycompany.myapp.domain.Typeintervento;

/**
 * Spring Data JPA repository for the Contratto entity.
 */
public interface TypeImpiantoRepository extends JpaRepository<Typeimpianto,Integer> {

	@Query("SELECT timp FROM Typeimpianto timp "
			+ "LEFT JOIN FETCH timp.typeinterventos tintervs "
			+ "LEFT JOIN FETCH tintervs.typeattivitas tatts "
			+ "WHERE timp.typeImpiantoId = :id")
 	public Typeimpianto findById(@Param("id") Integer id);
	
	public List<Typeimpianto> findByTypeconsistenza(Typeconsistenza typeConsistenza);
	
}
