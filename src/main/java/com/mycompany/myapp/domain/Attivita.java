package com.mycompany.myapp.domain;

// Generated 18-nov-2013 12.05.48 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

/**
 * Attivita generated by hbm2java
 */
@Entity
@Table(name = "t_attivita")
public class Attivita implements java.io.Serializable {

	private Integer attivitaId;
	@JsonBackReference("intervento.attivitas")
	private Intervento intervento;
	private Typeattivita typeattivita;

	public Attivita() {
	}
	
	public Attivita(Typeattivita typeattivita) {
		this.typeattivita = typeattivita;
	}

	public Attivita(Intervento intervento, Typeattivita typeattivita) {
		this.intervento = intervento;
		this.typeattivita = typeattivita;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "attivitaId", unique = true, nullable = false)
	public Integer getAttivitaId() {
		return this.attivitaId;
	}

	public void setAttivitaId(Integer attivitaId) {
		this.attivitaId = attivitaId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "interventoId")
	public Intervento getIntervento() {
		return this.intervento;
	}

	public void setIntervento(Intervento intervento) {
		this.intervento = intervento;
	}

	@ManyToOne
	@JoinColumn(name = "typeAttivitaId")
	public Typeattivita getTypeattivita() {
		return this.typeattivita;
	}

	public void setTypeattivita(Typeattivita typeattivita) {
		this.typeattivita = typeattivita;
	}

}
