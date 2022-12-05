package com.nttdata.spring.services;

import com.nttdata.spring.repository.Orders;
import com.nttdata.spring.repository.Products;

/**
 * Clase abstracta AbstractOrderDetails
 * 
 * @author Ángel Díaz Avilés
 */
public abstract class AbstractOrderDetails {

	/**
	 * Metodo que muestra el precio total de un pedido
	 * 
	 * @param order Pedido que queremos saber el precio
	 */
	public void seeTotalPrice(Orders order) {
		double priceTotal = 0;

		// Saco el precio de cada producto y lo sumo
		for (Products product : order.getProducts()) {
			priceTotal += product.getPricePVP();
		}
		System.out.println("Precio total del pedido " + priceTotal + " euros");
	}

	/**
	 * Metodo que muestra los detalles de un pedido
	 * 
	 * @param orders Pedido que queremos mostrar el detalle
	 */
	public void orderDetails(Orders orders) {
		System.out.println(orders.toString());
	}

	/**
	 * Metodo que añade un pedido a la lista de pedidos, simulando que se añadiria a
	 * la base de datos
	 * 
	 * @param order Pedido que queremos añadir
	 */
	public void addOrder(Orders order) {
		Orders.orders.add(order);
	}

	/**
	 * Metodo que modifica un pedido de la lista pedidos, simulando a la base de
	 * datos
	 * 
	 * @param order Pedido que queremos modificar
	 */
	public void updateOrder(Orders order) {
		for (Orders o : Orders.orders) {
			if (o.getOrderId() == order.getOrderId()) {
				// Elimino el pedido y lo vuelvo a añadir, aunque con la base de datos no seria
				// asi
				Orders.orders.remove(o);
				Orders.orders.add(order);
			}
		}
	}

	/**
	 * Metodo que elimina un pedido de la lista de pedidos, simulando a la base de
	 * datos
	 * 
	 * @param order Pedido que quieres eliminar
	 */
	public void deleteOrder(Orders order) {
		Orders.orders.remove(order);
	}

	/**
	 * Modifica un producto de un pedido
	 * 
	 * @param order   Pedido que queremos modificar un producto
	 * @param product Producto que queremos modificar
	 */
	public void updateProduct(Orders order, Products product) {
		for (Products p : order.getProducts()) {
			if (p.getProductId() == product.getProductId()) {
				// Elimino el producto y lo vuelvo a añadir, aunque con la base de datos no
				// seria
				// asi
				Products.products.remove(p);
				Products.products.add(product);
			}
		}
	}

	/**
	 * Metodo que elimina un producto de la lista de productos, simulando a la base
	 * de datos
	 * 
	 * @param product Producto que quieres eliminar
	 */
	public void deleteProduct(Products product) {
		Products.products.remove(product);
	}

	/**
	 * Metodo que lista todos los productos de un pedido
	 * 
	 * @param order Pedido que queremos listar los productos
	 */
	public void listProductsByOrders(Orders order) {
		for (Products product : order.getProducts()) {
			System.out.println(product);
		}
	}
}
