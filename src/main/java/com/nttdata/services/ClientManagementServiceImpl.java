package com.nttdata.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.apache.commons.lang3.StringUtils;
import com.nttdata.repository.Client;
import com.nttdata.repository.ClientI;

/**
 * Clase de implementacion de servicios del Cliente, ClientManagementServiceImpl
 * 
 * @author Ángel Díaz Avilés
 */
@Service("clientService")
public class ClientManagementServiceImpl implements ClientManagementServiceI {
	/** Cliente Dao */
	@Autowired
	private ClientI client;

	/**
	 * Metodo que devuelve un cliente, buscandolo a traves de su id en la base de
	 * datos
	 * 
	 * @param clientId ID del cliente que queremos sacar
	 * @return Cliente de la base de datos con el id
	 */
	@Override
	public Client searchById(final Long clientId) {
		Client client1 = null;

		// Si el id es diferente de 0
		if (clientId != 0) {

			// Cliente con el ID
			client1 = this.client.searchByClientId(clientId);
		}
		return client1;
	}

	/**
	 * Metodo que devuelve los clientes que contiene un mismo nombre en la base de
	 * datos
	 * 
	 * @param name Nombre de los clientes que queremos obtener
	 * @return List con todos los clientes que tienen ese nombre
	 */
	@Override
	public List<Client> searchByName(final String name) {
		List<Client> playersList = new ArrayList<>();

		// Si no es nulo
		if (StringUtils.isNotBlank(name)) {

			// Clientes con ese nombre
			playersList = client.searchByName(name);
		}
		return playersList;
	}

	/**
	 * Metodo que devuelve los clientes que contiene el mismo primer apellido en la
	 * base de datos
	 * 
	 * @param firstLastName Primer apellido de los clientes que queremos obtener
	 * @return List con todos los clientes que tienen ese primer apellido
	 */
	@Override
	public List<Client> searchByFirstLastName(String firstLastName) {
		List<Client> playersList = new ArrayList<>();

		// Si no es nulo
		if (StringUtils.isNotBlank(firstLastName)) {

			// Clientes con ese nombre
			playersList = client.searchByFirstLastName(firstLastName);
		}
		return playersList;
	}

	/**
	 * Metodo que devuelve los clientes que contiene el mismo segundo apellido en la
	 * base de datos
	 * 
	 * @param secondLastName Segundo apellido de los clientes que queremos obtener
	 * @return List con todos los clientes que tienen ese segundo apellido
	 */
	@Override
	public List<Client> searchBySecondLastName(String secondLastName) {
		List<Client> playersList = new ArrayList<>();

		// Si no es nulo
		if (StringUtils.isNotBlank(secondLastName)) {

			// Clientes con ese nombre
			playersList = client.searchBySecondLastName(secondLastName);
		}
		return playersList;
	}
}
