package com.nttdata.services;

import java.util.List;

import com.nttdata.repository.Client;

/**
 * Clase interfaz ClientManagementServiceI
 * 
 * @author Ángel Díaz Avilés
 */
public interface ClientManagementServiceI {
	/**
	 * Metodo que devuelve un cliente, buscandolo a traves de su id en la base de
	 * datos
	 * 
	 * @param clientId ID del cliente que queremos sacar
	 * @return Cliente de la base de datos con el id
	 */
	public Client searchById(final Long clientId);

	/**
	 * Metodo que devuelve los clientes que contiene un mismo nombre en la base de
	 * datos
	 * 
	 * @param name Nombre de los clientes que queremos obtener
	 * @return List con todos los clientes que tienen ese nombre
	 */
	public List<Client> searchByName(final String name);

	/**
	 * Metodo que devuelve los clientes que contiene el mismo primer apellido en la
	 * base de datos
	 * 
	 * @param firstLastName Primer apellido de los clientes que queremos obtener
	 * @return List con todos los clientes que tienen ese primer apellido
	 */
	public List<Client> searchByFirstLastName(String firstLastName);

	/**
	 * Metodo que devuelve los clientes que contiene el mismo segundo apellido en la
	 * base de datos
	 * 
	 * @param secondLastName Segundo apellido de los clientes que queremos obtener
	 * @return List con todos los clientes que tienen ese segundo apellido
	 */
	public List<Client> searchBySecondLastName(String secondLastName);
}
