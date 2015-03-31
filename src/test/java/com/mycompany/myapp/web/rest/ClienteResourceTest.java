package com.mycompany.myapp.web.rest;

import com.mycompany.myapp.Application;
import com.mycompany.myapp.domain.Cliente;
import com.mycompany.myapp.repository.ClienteRepository;

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
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * Test class for the ClienteResource REST controller.
 *
 * @see ClienteResource
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
@IntegrationTest
public class ClienteResourceTest {

    private static final String DEFAULT_COGNOME = "SAMPLE_TEXT";
    private static final String UPDATED_COGNOME = "UPDATED_TEXT";
    private static final String DEFAULT_NOME = "SAMPLE_TEXT";
    private static final String UPDATED_NOME = "UPDATED_TEXT";
    private static final String DEFAULT_CODICE_FISCALE = "SAMPLE_TEXT";
    private static final String UPDATED_CODICE_FISCALE = "UPDATED_TEXT";

    @Inject
    private ClienteRepository clienteRepository;

    private MockMvc restClienteMockMvc;

    private Cliente cliente;

    @PostConstruct
    public void setup() {
        MockitoAnnotations.initMocks(this);
        ClienteResource clienteResource = new ClienteResource();
        ReflectionTestUtils.setField(clienteResource, "clienteRepository", clienteRepository);
        this.restClienteMockMvc = MockMvcBuilders.standaloneSetup(clienteResource).build();
    }

    @Before
    public void initTest() {
        cliente = new Cliente();
        cliente.setCognome(DEFAULT_COGNOME);
        cliente.setNome(DEFAULT_NOME);
        cliente.setCodiceFiscale(DEFAULT_CODICE_FISCALE);
    }

    @Test
    @Transactional
    public void createCliente() throws Exception {
        // Validate the database is empty
        assertThat(clienteRepository.findAll()).hasSize(0);

        // Create the Cliente
        restClienteMockMvc.perform(post("/api/clientes")
                .contentType(TestUtil.APPLICATION_JSON_UTF8)
                .content(TestUtil.convertObjectToJsonBytes(cliente)))
                .andExpect(status().isCreated());

        // Validate the Cliente in the database
        List<Cliente> clientes = clienteRepository.findAll();
        assertThat(clientes).hasSize(1);
        Cliente testCliente = clientes.iterator().next();
        assertThat(testCliente.getCognome()).isEqualTo(DEFAULT_COGNOME);
        assertThat(testCliente.getNome()).isEqualTo(DEFAULT_NOME);
        assertThat(testCliente.getCodiceFiscale()).isEqualTo(DEFAULT_CODICE_FISCALE);
    }

    @Test
    @Transactional
    public void getAllClientes() throws Exception {
        // Initialize the database
        clienteRepository.saveAndFlush(cliente);

        // Get all the clientes
        restClienteMockMvc.perform(get("/api/clientes"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.[0].id").value(cliente.getId().intValue()))
                .andExpect(jsonPath("$.[0].cognome").value(DEFAULT_COGNOME.toString()))
                .andExpect(jsonPath("$.[0].nome").value(DEFAULT_NOME.toString()))
                .andExpect(jsonPath("$.[0].codiceFiscale").value(DEFAULT_CODICE_FISCALE.toString()));
    }

    @Test
    @Transactional
    public void getCliente() throws Exception {
        // Initialize the database
        clienteRepository.saveAndFlush(cliente);

        // Get the cliente
        restClienteMockMvc.perform(get("/api/clientes/{id}", cliente.getId()))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON))
            .andExpect(jsonPath("$.id").value(cliente.getId().intValue()))
            .andExpect(jsonPath("$.cognome").value(DEFAULT_COGNOME.toString()))
            .andExpect(jsonPath("$.nome").value(DEFAULT_NOME.toString()))
            .andExpect(jsonPath("$.codiceFiscale").value(DEFAULT_CODICE_FISCALE.toString()));
    }

    @Test
    @Transactional
    public void getNonExistingCliente() throws Exception {
        // Get the cliente
        restClienteMockMvc.perform(get("/api/clientes/{id}", 1L))
                .andExpect(status().isNotFound());
    }

    @Test
    @Transactional
    public void updateCliente() throws Exception {
        // Initialize the database
        clienteRepository.saveAndFlush(cliente);

        // Update the cliente
        cliente.setCognome(UPDATED_COGNOME);
        cliente.setNome(UPDATED_NOME);
        cliente.setCodiceFiscale(UPDATED_CODICE_FISCALE);
        restClienteMockMvc.perform(put("/api/clientes")
                .contentType(TestUtil.APPLICATION_JSON_UTF8)
                .content(TestUtil.convertObjectToJsonBytes(cliente)))
                .andExpect(status().isOk());

        // Validate the Cliente in the database
        List<Cliente> clientes = clienteRepository.findAll();
        assertThat(clientes).hasSize(1);
        Cliente testCliente = clientes.iterator().next();
        assertThat(testCliente.getCognome()).isEqualTo(UPDATED_COGNOME);
        assertThat(testCliente.getNome()).isEqualTo(UPDATED_NOME);
        assertThat(testCliente.getCodiceFiscale()).isEqualTo(UPDATED_CODICE_FISCALE);
    }

    @Test
    @Transactional
    public void deleteCliente() throws Exception {
        // Initialize the database
        clienteRepository.saveAndFlush(cliente);

        // Get the cliente
        restClienteMockMvc.perform(delete("/api/clientes/{id}", cliente.getId())
                .accept(TestUtil.APPLICATION_JSON_UTF8))
                .andExpect(status().isOk());

        // Validate the database is empty
        List<Cliente> clientes = clienteRepository.findAll();
        assertThat(clientes).hasSize(0);
    }
}
