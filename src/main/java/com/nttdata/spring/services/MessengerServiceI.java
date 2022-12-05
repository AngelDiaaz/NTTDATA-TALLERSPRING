package com.nttdata.spring.services;

import com.nttdata.spring.repository.Orders;
import com.nttdata.spring.repository.Products;

/**
 * Clase Interfaz MessengerServiceI
 * 
 * @author Ángel Díaz Avilés
 */
public interface MessengerServiceI {

	/**
	 * Metodo que elimina un pedido de la lista de pedidos, simulando a la base de
	 * datos
	 * 
	 * @param order Pedido que quieres eliminar
	 */
	public void deleteOrder(Orders order);

	/**
	 * Metodo que vincula un producto con un pedido
	 * 
	 * @param order    Pedido que queremos vincular
	 * @param products Producto a vincular
	 */
	public void addProductToAnOrder(Orders order, Products products);

	/**
	 * Metodo que elimina un producto de la lista de productos, simulando a la base
	 * de datos
	 * 
	 * @param product Producto que quieres eliminar
	 */
	public void deleteProduct(Products product);

	/**
	 * Metodo que lista todos los productos de un pedido
	 * 
	 * @param order Pedido que queremos listar los productos
	 */
	public void listProductsByOrders(Orders order);

	/**
	 * Metodo que añade un pedido a la lista de pedidos, simulando que se añadiria a
	 * la base de datos
	 * 
	 * @param order Pedido que queremos añadir
	 */
	public void addOrder(Orders order);

	/**
	 * Metodo que añade un producto a la lista de productos, simulando que se
	 * añadiria a la base de datos
	 * 
	 * @param product Producto que queremos añadir
	 */
	public void addProduct(Products product);

	/**
	 * Metodo que muestra los detalles de un pedido
	 * 
	 * @param orders Pedido que queremos mostrar el detalle
	 */
	public void orderDetails(Orders orders);

	/**
	 * Metodo que modifica un pedido de la lista pedidos, simulando a la base de
	 * datos
	 * 
	 * @param order Pedido que queremos modificar
	 */
	public void updateOrder(Orders order);

	/**
	 * Modifica un producto de un pedido
	 * 
	 * @param order   Pedido que queremos modificar un producto
	 * @param product Producto que queremos modificar
	 */
	public void updateProduct(Orders order, Products product);

	/**
	 * Metodo que lista todos los productos de un pedido
	 * 
	 * @param order Pedido que queremos listar los productos
	 */
	public void seeTotalPrice(Orders order);
}
