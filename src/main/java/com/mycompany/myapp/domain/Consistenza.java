package com.mycompany.myapp.domain;

// Generated 18-nov-2013 12.05.48 by Hibernate Tools 3.4.0.CR1

import static javax.persistence.GenerationType.IDENTITY;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

/**
 * Consistenza generated by hbm2java
 */
@Entity
@Table(name = "t_consistenza")
public class Consistenza implements java.io.Serializable {

	private Integer consistenzaId;
	private Typeconsistenza typeconsistenza;
	@JsonBackReference("contratto.consitenzas")
	private Contratto contratto;
	@JsonManagedReference("consistenza.impiantos")
	private Set<Impianto> impiantos = new HashSet<Impianto>(0);

	public Consistenza() {
	}
	
	public Consistenza(Typeconsistenza typeconsistenza) {
		this.typeconsistenza = typeconsistenza;
	}

	public Consistenza(Typeconsistenza typeconsistenza, Contratto contratto,
			Set<Impianto> impiantos) {
		this.typeconsistenza = typeconsistenza;
		this.contratto = contratto;
		this.impiantos = impiantos;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "consistenzaId", unique = true, nullable = false)
	public Integer getConsistenzaId() {
		return this.consistenzaId;
	}

	public void setConsistenzaId(Integer consistenzaId) {
		this.consistenzaId = consistenzaId;
	}

	@ManyToOne
	@JoinColumn(name = "typeConsistenzaId")
	public Typeconsistenza getTypeconsistenza() {
		return this.typeconsistenza;
	}

	public void setTypeconsistenza(Typeconsistenza typeconsistenza) {
		this.typeconsistenza = typeconsistenza;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "contrattoId")
	public Contratto getContratto() {
		return this.contratto;
	}

	public void setContratto(Contratto contratto) {
		this.contratto = contratto;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "consistenza", cascade={CascadeType.ALL})
	public Set<Impianto> getImpiantos() {
		return this.impiantos;
	}

	public void setImpiantos(Set<Impianto> impiantos) {
		this.impiantos = impiantos;
	}

	public void linkBidirectionalAassociations(){
		
		for (Impianto impianto : this.getImpiantos()) {
			impianto.setConsistenza(this);
			impianto.linkBidirectionalAassociations();
		}
	}

}
