package com.nttdata.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Clase interfez ContractI
 * 
 * @author Ángel Díaz Avilés
 */
@Repository
public interface ContractI extends JpaRepository<Contract, Long> {

	/**
	 * Localiza un objeto por su ID de la base de datos	
	 * 
	 * @param id ID del objeto que queremos buscar
	 * @return Objeto con esa ID
	 */
	public Contract searchByContractId(final Long contractId);

	/**
	 * Metodo que busqua los contratos a traves de Id del cliente al que esta
	 * asociados esos contratos en la base de datos
	 * 
	 * @param clientId Id del cliente que queremos sacar los contratos
	 * @return List con los contratos que estan asociados a ese cliente
	 */
	public List<Contract> searchByClient(final Long clientId);
}
