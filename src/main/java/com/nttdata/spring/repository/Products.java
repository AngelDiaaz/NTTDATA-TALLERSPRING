package com.nttdata.spring.repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase Products
 * 
 * @author Ángel Díaz Avilés
 */
public class Products {

	/**
	 * List de products, simulo la tabla de la base de datos
	 */
	public static List<Products> products = new ArrayList<>();

	// Propiedades
	private int productId;
	private String name;
	private double pricePVP;
	private double price;
	private Orders order;

	// Constructor
	public Products() {
		super();
	}

	public Products(int productId, String name, double price, Orders order) {
		super();
		this.productId = productId;
		this.name = name;
		this.price = price;
		this.order = order;
	}

	// Getters y setters
	public Orders getOrder() {
		return order;
	}

	public void setOrder(Orders order) {
		this.order = order;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPricePVP() {
		return pricePVP;
	}

	public void setPricePVP(double pricePVP) {
		this.pricePVP = pricePVP;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	// toString
	@Override
	public String toString() {
		return "Products [productId=" + productId + ", name=" + name + ", pricePVP=" + pricePVP + ", price=" + price
				+ "]";
	}
}
