package com.nttdata.repository;

import org.springframework.stereotype.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Clase interfez ClientI
 * 
 * @author Ángel Díaz Avilés
 */
@Repository
public interface ClientI extends JpaRepository<Client, Long> {
	/**
	 * Localiza un objeto por su ID de la base de datos	
	 * 
	 * @param id ID del objeto que queremos buscar
	 * @return Objeto con esa ID
	 */
	public Client searchByClientId(final Long id);

	/**
	 * Devuelve los clientes que tienen ese nombre en la base de datos
	 * 
	 * @param name Nombre de los clientes que queremos obtener de la base de datos
	 * @return Clientes que contienen ese name
	 */
	public List<Client> searchByName(final String name);

	/**
	 * Devuelve los clientes que tienen ese primer apellido en la base de datos
	 * 
	 * @param firstLastName Primer apellido de los clientes que queremos obtener de
	 *                      la base de datos
	 * @return Clientes que contienen ese firstLastName
	 */
	public List<Client> searchByFirstLastName(final String firstLastName);

	/**
	 * Devuelve los clientes que tienen ese segundo apellido en la base de datos
	 * 
	 * @param secondLastName Segundo apellido de los clientes que queremos obtener
	 *                       de la base de datos
	 * @return Clientes que contienen ese secondLastName
	 */
	public List<Client> searchBySecondLastName(final String secondLastName);
}
