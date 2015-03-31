package com.mycompany.myapp.web.rest;

import com.mycompany.myapp.Application;
import com.mycompany.myapp.domain.Contratto;
import com.mycompany.myapp.repository.ContrattoRepository;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.util.ReflectionTestUtils;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import java.math.BigDecimal;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * Test class for the ContrattoResource REST controller.
 *
 * @see ContrattoResource
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
@IntegrationTest
public class ContrattoResourceTest {

    private static final DateTimeFormatter dateTimeFormatter = DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm:ss'Z'");


    private static final DateTime DEFAULT_DECORRENZA_DATE = new DateTime(0L, DateTimeZone.UTC);
    private static final DateTime UPDATED_DECORRENZA_DATE = new DateTime(DateTimeZone.UTC).withMillisOfSecond(0);
    private static final String DEFAULT_DECORRENZA_DATE_STR = dateTimeFormatter.print(DEFAULT_DECORRENZA_DATE);

    private static final DateTime DEFAULT_SCADENZA_DATE = new DateTime(0L, DateTimeZone.UTC);
    private static final DateTime UPDATED_SCADENZA_DATE = new DateTime(DateTimeZone.UTC).withMillisOfSecond(0);
    private static final String DEFAULT_SCADENZA_DATE_STR = dateTimeFormatter.print(DEFAULT_SCADENZA_DATE);

    private static final BigDecimal DEFAULT_IMPORTO = BigDecimal.ZERO;
    private static final BigDecimal UPDATED_IMPORTO = BigDecimal.ONE;

    private static final Integer DEFAULT_DISCOUNT_PERCENT = 0;
    private static final Integer UPDATED_DISCOUNT_PERCENT = 1;

    @Inject
    private ContrattoRepository contrattoRepository;

    private MockMvc restContrattoMockMvc;

    private Contratto contratto;

    @PostConstruct
    public void setup() {
        MockitoAnnotations.initMocks(this);
        ContrattoResource contrattoResource = new ContrattoResource();
        ReflectionTestUtils.setField(contrattoResource, "contrattoRepository", contrattoRepository);
        this.restContrattoMockMvc = MockMvcBuilders.standaloneSetup(contrattoResource).build();
    }

    @Before
    public void initTest() {
        contratto = new Contratto();
        contratto.setDecorrenzaDate(DEFAULT_DECORRENZA_DATE);
        contratto.setScadenzaDate(DEFAULT_SCADENZA_DATE);
        contratto.setImporto(DEFAULT_IMPORTO);
        contratto.setDiscountPercent(DEFAULT_DISCOUNT_PERCENT);
    }

    @Test
    @Transactional
    public void createContratto() throws Exception {
        // Validate the database is empty
        assertThat(contrattoRepository.findAll()).hasSize(0);

        // Create the Contratto
        restContrattoMockMvc.perform(post("/api/contrattos")
                .contentType(TestUtil.APPLICATION_JSON_UTF8)
                .content(TestUtil.convertObjectToJsonBytes(contratto)))
                .andExpect(status().isCreated());

        // Validate the Contratto in the database
        List<Contratto> contrattos = contrattoRepository.findAll();
        assertThat(contrattos).hasSize(1);
        Contratto testContratto = contrattos.iterator().next();
        assertThat(testContratto.getDecorrenzaDate().toDateTime(DateTimeZone.UTC)).isEqualTo(DEFAULT_DECORRENZA_DATE);
        assertThat(testContratto.getScadenzaDate().toDateTime(DateTimeZone.UTC)).isEqualTo(DEFAULT_SCADENZA_DATE);
        assertThat(testContratto.getImporto()).isEqualTo(DEFAULT_IMPORTO);
        assertThat(testContratto.getDiscountPercent()).isEqualTo(DEFAULT_DISCOUNT_PERCENT);
    }

    @Test
    @Transactional
    public void getAllContrattos() throws Exception {
        // Initialize the database
        contrattoRepository.saveAndFlush(contratto);

        // Get all the contrattos
        restContrattoMockMvc.perform(get("/api/contrattos"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.[0].id").value(contratto.getId().intValue()))
                .andExpect(jsonPath("$.[0].decorrenzaDate").value(DEFAULT_DECORRENZA_DATE_STR))
                .andExpect(jsonPath("$.[0].scadenzaDate").value(DEFAULT_SCADENZA_DATE_STR))
                .andExpect(jsonPath("$.[0].importo").value(DEFAULT_IMPORTO.intValue()))
                .andExpect(jsonPath("$.[0].discountPercent").value(DEFAULT_DISCOUNT_PERCENT));
    }

    @Test
    @Transactional
    public void getContratto() throws Exception {
        // Initialize the database
        contrattoRepository.saveAndFlush(contratto);

        // Get the contratto
        restContrattoMockMvc.perform(get("/api/contrattos/{id}", contratto.getId()))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON))
            .andExpect(jsonPath("$.id").value(contratto.getId().intValue()))
            .andExpect(jsonPath("$.decorrenzaDate").value(DEFAULT_DECORRENZA_DATE_STR))
            .andExpect(jsonPath("$.scadenzaDate").value(DEFAULT_SCADENZA_DATE_STR))
            .andExpect(jsonPath("$.importo").value(DEFAULT_IMPORTO.intValue()))
            .andExpect(jsonPath("$.discountPercent").value(DEFAULT_DISCOUNT_PERCENT));
    }

    @Test
    @Transactional
    public void getNonExistingContratto() throws Exception {
        // Get the contratto
        restContrattoMockMvc.perform(get("/api/contrattos/{id}", 1L))
                .andExpect(status().isNotFound());
    }

    @Test
    @Transactional
    public void updateContratto() throws Exception {
        // Initialize the database
        contrattoRepository.saveAndFlush(contratto);

        // Update the contratto
        contratto.setDecorrenzaDate(UPDATED_DECORRENZA_DATE);
        contratto.setScadenzaDate(UPDATED_SCADENZA_DATE);
        contratto.setImporto(UPDATED_IMPORTO);
        contratto.setDiscountPercent(UPDATED_DISCOUNT_PERCENT);
        restContrattoMockMvc.perform(put("/api/contrattos")
                .contentType(TestUtil.APPLICATION_JSON_UTF8)
                .content(TestUtil.convertObjectToJsonBytes(contratto)))
                .andExpect(status().isOk());

        // Validate the Contratto in the database
        List<Contratto> contrattos = contrattoRepository.findAll();
        assertThat(contrattos).hasSize(1);
        Contratto testContratto = contrattos.iterator().next();
        assertThat(testContratto.getDecorrenzaDate().toDateTime(DateTimeZone.UTC)).isEqualTo(UPDATED_DECORRENZA_DATE);
        assertThat(testContratto.getScadenzaDate().toDateTime(DateTimeZone.UTC)).isEqualTo(UPDATED_SCADENZA_DATE);
        assertThat(testContratto.getImporto()).isEqualTo(UPDATED_IMPORTO);
        assertThat(testContratto.getDiscountPercent()).isEqualTo(UPDATED_DISCOUNT_PERCENT);
    }

    @Test
    @Transactional
    public void deleteContratto() throws Exception {
        // Initialize the database
        contrattoRepository.saveAndFlush(contratto);

        // Get the contratto
        restContrattoMockMvc.perform(delete("/api/contrattos/{id}", contratto.getId())
                .accept(TestUtil.APPLICATION_JSON_UTF8))
                .andExpect(status().isOk());

        // Validate the database is empty
        List<Contratto> contrattos = contrattoRepository.findAll();
        assertThat(contrattos).hasSize(0);
    }
}
