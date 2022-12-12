package com.nttdata.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nttdata.repository.Contract;
import com.nttdata.repository.ContractI;

/**
 * Clase de implementacion de servicios del Contrato,
 * ContractManagementServiceImpl
 * 
 * @author Ángel Díaz Avilés
 */
@Service("contractService")
public class ContractManagementServiceImpl implements ContractManagementServiceI {
	/** Contract Dao */
	@Autowired
	private ContractI contract;

	/**
	 * Metodo que devuelve un contrato, buscandolo a traves de su id en la base de
	 * datos
	 * 
	 * @param contractId ID del Contrato que queremos sacar
	 * @return Contrato de la base de datos con el id
	 */
	@Override
	public Contract searchById(Long contractId) {
		Contract contract1 = null;

		// Si el id es diferente de 0
		if (contractId != 0) {

			// Cliente con el ID
			contract1 = contract.searchByContractId(contractId);
		}
		return contract1;
	}

	/**
	 * Metodo que busqua los contratos a traves de Id del cliente al que esta
	 * asociados esos contratos en la base de datos
	 * 
	 * @param clientId Id del cliente que queremos sacar los contratos
	 * @return List con los contratos que estan asociados a ese cliente
	 */
	@Override
	public List<Contract> searchByClient(Long clientId) {
		List<Contract> contracts = new ArrayList<>();

		// Si el id es diferente de 0
		if (clientId != 0) {

			// Cliente con el ID
			contracts = contract.searchByClient(clientId);
		}
		return contracts;
	}
}
