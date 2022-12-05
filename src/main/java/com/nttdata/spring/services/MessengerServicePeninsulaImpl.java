package com.nttdata.spring.services;

import org.springframework.stereotype.Service;

import com.nttdata.spring.repository.Orders;
import com.nttdata.spring.repository.Products;

/**
 * Clase MessengerServicePeninsulaImpl, hereda de AbstractOrderDetails
 * 
 * @author Ángel Díaz Avilés
 */
@Service("peninsulaService")
public class MessengerServicePeninsulaImpl extends AbstractOrderDetails implements MessengerServiceI {

	/**
	 * Metodo que añade un producto a la lista de productos, simulando que se
	 * añadiria a la base de datos
	 * 
	 * @param product Producto que queremos añadir
	 */
	@Override
	public void addProduct(Products product) {
		// Calculo el precio que tendra dentro de la peninsula
		product.setPricePVP(product.getPrice() * 1.21);
		Products.products.add(product);
	}

	/**
	 * Metodo que vincula un producto con un pedido
	 * 
	 * @param order    Pedido que queremos vincular
	 * @param products Producto a vincular
	 */
	@Override
	public void addProductToAnOrder(Orders order, Products product) {
		product.setPricePVP(product.getPrice() * 1.21);
		for (Orders o : Orders.orders) {
			if (o.equals(order)) {
				o.getProducts().add(product);
			}
		}
	}
}
