package com.mycompany.myapp.service;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mycompany.myapp.domain.Attivita;
import com.mycompany.myapp.domain.Consistenza;
import com.mycompany.myapp.domain.Impianto;
import com.mycompany.myapp.domain.Intervento;
import com.mycompany.myapp.domain.Typeattivita;
import com.mycompany.myapp.domain.Typeconsistenza;
import com.mycompany.myapp.domain.Typeimpianto;
import com.mycompany.myapp.domain.Typeintervento;
import com.mycompany.myapp.repository.ContrattoRepository;
import com.mycompany.myapp.repository.TypeAttivitaRepository;
import com.mycompany.myapp.repository.TypeConsistenzaRepository;
import com.mycompany.myapp.repository.TypeImpiantoRepository;
import com.mycompany.myapp.repository.TypeInterventoRepository;

/**
 * Service class for managing users.
 */
@Service
@Transactional
public class ContrattoService {

	private final Logger log = LoggerFactory.getLogger(ContrattoService.class);

	@Inject
	private ContrattoRepository contrattoRepository;

	@Inject
	private TypeConsistenzaRepository typeConsistenzaRepository;

	@Inject
	private TypeImpiantoRepository typeImpiantoRepository;

	@Inject
	private TypeInterventoRepository typeInterventoRepository;

	@Inject
	private TypeAttivitaRepository typeAttivitaRepository;

	// add all children of typeConsistenza
	public Consistenza createConsistenza(Integer typeId) {
		Consistenza consistenza = new Consistenza();

		Typeconsistenza tConsistenza = typeConsistenzaRepository.findById(typeId);

		consistenza.setTypeconsistenza(tConsistenza);

		for (Typeimpianto tImpianto : tConsistenza.getTypeimpiantos()) {

			Impianto impianto = new Impianto(tImpianto);

			consistenza.getImpiantos().add(impianto);

			for (Typeintervento tIntervento : tImpianto.getTypeinterventos()) {

				Intervento intervento = new Intervento(tIntervento);

				impianto.getInterventos().add(intervento);

				for (Typeattivita tAttivita : tIntervento.getTypeattivitas()) {

					Attivita attivita = new Attivita(tAttivita);

					intervento.getAttivitas().add(attivita);
				}
			}
		}

		return consistenza;
	}

	public Impianto createImpianto(Integer typeId) {
		Impianto impianto = new Impianto();

		Typeimpianto tImpianto = typeImpiantoRepository.findById(typeId);

		impianto.setTypeimpianto(tImpianto);

		for (Typeintervento tIntervento : tImpianto.getTypeinterventos()) {

			Intervento intervento = new Intervento(tIntervento);

			impianto.getInterventos().add(intervento);

			for (Typeattivita tAttivita : tIntervento.getTypeattivitas()) {

				Attivita attivita = new Attivita(tAttivita);

				intervento.getAttivitas().add(attivita);
			}
		}

		return impianto;
	}

	public Intervento createIntervento(Integer typeId) {
		Intervento intervento = new Intervento();

		Typeintervento tIntervento = typeInterventoRepository.findById(typeId);

		intervento.setTypeintervento(tIntervento);

		for (Typeattivita tAttivita : tIntervento.getTypeattivitas()) {

			Attivita attivita = new Attivita(tAttivita);

			intervento.getAttivitas().add(attivita);
		}

		return intervento;
	}
	
	public Attivita createAttivita(Integer typeId) {
		Attivita attivita = new Attivita();

		Typeattivita tAttivita= typeAttivitaRepository.findById(typeId);

		attivita.setTypeattivita(tAttivita);

		return attivita;
	}

}
