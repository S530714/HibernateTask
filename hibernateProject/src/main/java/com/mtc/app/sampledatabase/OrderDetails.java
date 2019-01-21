package com.mtc.app.sampledatabase;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="orderdetails")
public class OrderDetails {

	@Id
	private int orderNumber;
	private String productCode;
	private int quantityOrdered;
	private BigDecimal priceEach;
	private short orderLineNumber;
	

	
//	mapped by Table name
	@OneToOne(mappedBy="products")
//	cls name table name
	private Products products;
	
//	@OneToOne
////	name =" primary key " at one side
//	@JoinColumn(name="orderNumber")
////	cls name table name
//	private OrderDetails orderdetails;
	
	public OrderDetails() {
		super();
	}

	public OrderDetails(int orderNumber, String productCode, int quantityOrdered, BigDecimal priceEach,
			short orderLineNumber, Products products, OrderDetails orderdetails) {
		super();
		this.orderNumber = orderNumber;
		this.productCode = productCode;
		this.quantityOrdered = quantityOrdered;
		this.priceEach = priceEach;
		this.orderLineNumber = orderLineNumber;
		this.products = products;
//		this.orderdetails = orderdetails;
	}

	public int getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public int getQuantityOrdered() {
		return quantityOrdered;
	}

	public void setQuantityOrdered(int quantityOrdered) {
		this.quantityOrdered = quantityOrdered;
	}

	public BigDecimal getPriceEach() {
		return priceEach;
	}

	public void setPriceEach(BigDecimal priceEach) {
		this.priceEach = priceEach;
	}

	public short getOrderLineNumber() {
		return orderLineNumber;
	}

	public void setOrderLineNumber(short orderLineNumber) {
		this.orderLineNumber = orderLineNumber;
	}

	public Products getProducts() {
		return products;
	}

	public void setProducts(Products products) {
		this.products = products;
	}

//	public OrderDetails getOrderdetails() {
//		return orderdetails;
//	}
//
//	public void setOrderdetails(OrderDetails orderdetails) {
//		this.orderdetails = orderdetails;
//	}

	@Override
	public String toString() {
		return "OrderDetails [orderNumber=" + orderNumber + ", productCode=" + productCode + ", quantityOrdered="
				+ quantityOrdered + ", priceEach=" + priceEach + ", orderLineNumber=" + orderLineNumber + ", products="
				+ products +  "]";
	}

	
}
