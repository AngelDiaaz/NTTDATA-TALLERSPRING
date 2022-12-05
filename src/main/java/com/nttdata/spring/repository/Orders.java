package com.nttdata.spring.repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase Orders
 * 
 * @author Ángel Díaz Avilés
 */
public class Orders {
	/**
	 * List de pedidos, simulo la tabla de la base de datos
	 */
	public static List<Orders> orders = new ArrayList<>();

	// Propiedades
	private int orderId;
	private String destination;
	private String addres;
	private boolean peninsula;
	private List<Products> products;

	// Constructor
	public Orders() {
		super();
	}

	public Orders(int orderId, String destination, String addres, boolean peninsula, List<Products> products) {
		super();
		this.orderId = orderId;
		this.destination = destination;
		this.addres = addres;
		this.peninsula = peninsula;
		this.products = products;
	}

	// Getters y setters
	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getAddres() {
		return addres;
	}

	public void setAddres(String addres) {
		this.addres = addres;
	}

	public boolean getPeninsula() {
		return peninsula;
	}

	public void setPeninsula(boolean peninsula) {
		this.peninsula = peninsula;
	}

	public List<Products> getProducts() {
		return products;
	}

	public void setProducts(List<Products> products) {
		this.products = products;
	}

	// toString
	@Override
	public String toString() {
		return "Orders [orderId=" + orderId + ", destination=" + destination + ", addres=" + addres + ", peninsula="
				+ peninsula + ", products=" + products + "]";
	}
}
