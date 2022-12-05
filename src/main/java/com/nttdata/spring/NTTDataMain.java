package com.nttdata.spring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nttdata.spring.repository.Orders;
import com.nttdata.spring.repository.Products;
import com.nttdata.spring.services.MessengerServiceI;

/**
 * Clase principal NTTDataMain
 * 
 * @author Ángel Díaz Avilés
 */
@SpringBootApplication()
public class NTTDataMain implements CommandLineRunner {

	// Servicio para los pedidos fuera de la peninsula
	@Autowired
	@Qualifier("CMCService")
	private MessengerServiceI serviceCMC;

	// Servicio para los pedidos dentro de la peninsula
	@Autowired
	@Qualifier("peninsulaService")
	private MessengerServiceI servicePeninsula;

	/**
	 * Método principal
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

		// Creo el pedido
		Orders order1 = new Orders();
		order1.setOrderId(1);
		order1.setAddres("Calle Magallanes");
		order1.setDestination("Malaga");
		order1.setPeninsula(true);

		// Creo los productos
		Products product1 = new Products();
		product1.setProductId(1);
		product1.setName("Movil");
		product1.setPrice(200);
		product1.setOrder(order1);

		Products product2 = new Products();
		product2.setProductId(2);
		product2.setName("Pantalla");
		product2.setPrice(100);
		product2.setOrder(order1);

		// Añado una list a los pedidos
		List<Products> products = new ArrayList<>();
		order1.setProducts(products);

		// Si el pedido es en la peninsula
		if (order1.getPeninsula()) {
			// Simularia la insercion a la base de datos
			servicePeninsula.addOrder(order1);
			servicePeninsula.addProduct(product1);
			servicePeninsula.addProduct(product2);

			// Vinculo los productos con el pedido
			servicePeninsula.addProductToAnOrder(order1, product1);
			servicePeninsula.addProductToAnOrder(order1, product2);

			// Muestro el precio total del pedido
			servicePeninsula.seeTotalPrice(order1);

			// Muestro los detalles del pedido
			servicePeninsula.orderDetails(order1);

			// Muestro todos los productos de un pedido
			servicePeninsula.listProductsByOrders(order1);

		} else { // Si es fuera de la peninsula

			// Simularia la insercion a la base de datos
			serviceCMC.addOrder(order1);
			serviceCMC.addProduct(product1);
			serviceCMC.addProduct(product2);

			// Vinculo los productos con el pedido
			serviceCMC.addProductToAnOrder(order1, product1);
			serviceCMC.addProductToAnOrder(order1, product2);

			// Muestro el precio total del pedido
			serviceCMC.seeTotalPrice(order1);

			// Muestro los detalles del pedido
			serviceCMC.orderDetails(order1);

			// Muestro todos los productos de un pedido
			serviceCMC.listProductsByOrders(order1);
		}
	}
}
