package com.nttdata;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nttdata.repository.Client;
import com.nttdata.repository.ClientI;
import com.nttdata.repository.Contract;
import com.nttdata.repository.ContractI;
import com.nttdata.services.ClientManagementServiceI;
import com.nttdata.services.ContractManagementServiceI;

/**
 * Clase principal NTTDataMain
 * 
 * @author Ángel Díaz Avilés
 */
@SpringBootApplication
public class NTTDataMain implements CommandLineRunner {

	/** Servicio de los clientes */
	@Autowired
	@Qualifier("clientService")
	private ClientManagementServiceI clientService;
	
	/** Servicio de los contratos */
	@Autowired
	@Qualifier("contractService")
	private ContractManagementServiceI contractService;
	
	/** Repositorio clientes */
	@Autowired
	private ClientI clients;
	
	/** Repositorio contratos */
	@Autowired
	private ContractI contracts;

	/**
	 * Metodo principal
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(NTTDataMain.class, args);
	}

	/**
	 * Metodo run para ejecutar el programa
	 */
	@Override
	public void run(String... args) throws Exception {

		// Creo los contratos
		Contract contract1 = new Contract();
		contract1.setDateValidity("2010-05-12");
		contract1.setDateExpiration("2015-07-19");
		contract1.setMonthlyPrice(1500);

		Contract contract2 = new Contract();
		contract2.setDateValidity("2018-06-21");
		contract2.setDateExpiration("2020-10-09");
		contract2.setMonthlyPrice(1500);

		// Creo los clientes
		Client client1 = new Client();
		client1.setName("Juan");
		client1.setFirstLastName("Perez");
		client1.setSecondLastName("Rodriguez");
		client1.setDni("14725836Q");

		Client client2 = new Client();
		client2.setName("Pepe");
		client2.setFirstLastName("Gonzalez");
		client2.setSecondLastName("Macias");
		client2.setDni("98765432Z");

		Client client3 = new Client();
		client3.setName("Maria");
		client3.setFirstLastName("Ramirez");
		client3.setSecondLastName("Lopez");
		client3.setDni("12345678A");

		// Vinculo los contratos con los clientes
		contract1.setClient(client1);
		contract2.setClient(client1);
		contract2.setClient(client3);
		
		// Inserto los contratos en la base de datos
		contracts.save(contract1);
		contracts.save(contract2);
		
		// Inserto los clientes en la base de datos
		clients.save(client1);
		clients.save(client2);
		clients.save(client3);
		
		// Realizo algunas consultas a la base de datos
		System.out.println("\nConsulta en la base de datos\n");

		System.out.println(clientService.searchByName("Pepe"));
		System.out.println(clientService.searchByFirstLastName("Ramirez"));
		System.out.println(clientService.searchBySecondLastName("Rodriguez"));
	}
}
