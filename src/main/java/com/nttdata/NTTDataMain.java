package com.nttdata;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Clase principal NTTDataMain
 * 
 * @author Ángel Díaz Avilés
 */
@SpringBootApplication
public class NTTDataMain implements CommandLineRunner {

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
		System.out.println("Servidor local ejecutado");
	}
}
