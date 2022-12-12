package com.nttdata.services;

import java.util.List;

import com.nttdata.repository.Contract;

/**
 * Clase interfaz ContractManagementServiceI
 * 
 * @author Ángel Díaz Avilés
 */
public interface ContractManagementServiceI {

	/**
	 * Metodo que devuelve un contrato, buscandolo a traves de su id en la base de
	 * datos
	 * 
	 * @param contractId ID del Contrato que queremos sacar
	 * @return Contrato de la base de datos con el id
	 */
	public Contract searchById(final Long contractId);

	/**
	 * Metodo que busqua los contratos a traves de Id del cliente al que esta
	 * asociados esos contratos en la base de datos
	 * 
	 * @param clientId Id del cliente que queremos sacar los contratos
	 * @return List con los contratos que estan asociados a ese cliente
	 */
	public List<Contract> searchByClient(final Long clientId);
}
