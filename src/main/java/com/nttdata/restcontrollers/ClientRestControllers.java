package com.nttdata.restcontrollers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nttdata.repository.Client;

/**
 * Clase ClientRestControllers, contiene los elementos para el controlador REST
 * 
 * @author Ángel Díaz Avilés
 */
@RestController
@RequestMapping("/home/clients")
public class ClientRestControllers {

	// Anotacion no se como quitar los warnings de sonar en @RequestMapping y en los
	// objetos de clientes en los metodos

	/** Simula repositorio */
	private Map<Long, Client> clientsList;

	/**
	 * Constructor simula repositorio
	 */
	public ClientRestControllers() {

		clientsList = new HashMap<>();

		// Creo los dos clientes para simular el repositorio
		final Client client1 = new Client();
		client1.setClientId((long) 1);
		client1.setName("Pepe");
		client1.setFirstLastName("Gonzalez");
		client1.setSecondLastName("Macias");
		client1.setDni("98765432Z");
		clientsList.put((long) 1, client1);

		final Client client2 = new Client();
		client2.setClientId((long) 2);
		client2.setName("Maria");
		client2.setFirstLastName("Ramirez");
		client2.setSecondLastName("Lopez");
		client2.setDni("12345678A");
		clientsList.put((long) 2, client2);
	}

	/**
	 * Retorna todos los clientes del repositorio
	 * 
	 * @return List<Client> Lista de clientes
	 */
	@GetMapping
	public Map<Long, Client> showGames() {
		return clientsList;
	}

	/**
	 * Añade un nuevo cliente al repositorio
	 * 
	 * @param newClient Cliente que queremos añadir
	 */
	@PostMapping
	public void addClient(final @RequestBody Client newClient) {
		clientsList.put(newClient.getClientId(), newClient);
	}

	/**
	 * Elimina un cliente del repositorio
	 * 
	 * @param clientId Id del cliente que queremos eliminar
	 */
	@DeleteMapping(value = "/{clientId}")
	public void deleteClient(final @PathVariable Long clientId) {
		clientsList.remove(clientId);
	}

	/**
	 * Búsqueda por el Id del cliente
	 * 
	 * @param client Cliente con el Id que queremos buscar
	 * @return client Cliente con el Id
	 */
	@RequestMapping(path = "/client", method = RequestMethod.GET, consumes = "application/json")
	public Client searchById(@RequestBody Client client) {
		return clientsList.get(client.getClientId());
	}
}
