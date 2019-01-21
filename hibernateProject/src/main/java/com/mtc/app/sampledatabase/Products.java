package com.mtc.app.sampledatabase;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="products")
public class Products {

	@Id
	private String productCode;
	private String productName;
//	private String productLine;
	private String productScale;
	private String productVendor;
	private String productDescription;
	private short quantityInStock;
	private BigDecimal buyPrice;
	private BigDecimal MSRP;
	
	@ManyToOne
//	name =" primary key " at one side
	@JoinColumn(name="productLine")
//	cls name table name
	private ProductLines productlines;

	@OneToOne
//	name =" primary key " at one side
	@JoinColumn(name="productCode")
//	cls name table name
	private OrderDetails orderdetails;
	
	
	public Products() {
		super();
	}
	
	public Products(String productCode, String productName, String productLine, String productScale,
			String productVendor, String productDescription, short quantityInStock, BigDecimal buyPrice, BigDecimal mSRP) {
		super();
		this.productCode = productCode;
		this.productName = productName;
//		this.productLine = productLine;
		this.productScale = productScale;
		this.productVendor = productVendor;
		this.productDescription = productDescription;
		this.quantityInStock = quantityInStock;
		this.buyPrice = buyPrice;
		MSRP = mSRP;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}



	public String getProductScale() {
		return productScale;
	}

	public void setProductScale(String productScale) {
		this.productScale = productScale;
	}

	public String getProductVendor() {
		return productVendor;
	}

	public void setProductVendor(String productVendor) {
		this.productVendor = productVendor;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public short getQuantityInStock() {
		return quantityInStock;
	}

	public void setQuantityInStock(short quantityInStock) {
		this.quantityInStock = quantityInStock;
	}

	public BigDecimal getBuyPrice() {
		return buyPrice;
	}

	public void setBuyPrice(BigDecimal buyPrice) {
		this.buyPrice = buyPrice;
	}

	public BigDecimal getMSRP() {
		return MSRP;
	}

	public void setMSRP(BigDecimal mSRP) {
		MSRP = mSRP;
	}

	public ProductLines getProductlines() {
		return productlines;
	}

	public void setProductlines(ProductLines productlines) {
		this.productlines = productlines;
	}

	public OrderDetails getOrderdetails() {
		return orderdetails;
	}

	public void setOrderdetails(OrderDetails orderdetails) {
		this.orderdetails = orderdetails;
	}

	
	@Override
	public String toString() {
		return "Products [productCode=" + productCode + ", productName=" + productName + ", productScale="
				+ productScale + ", productVendor=" + productVendor + ", productDescription=" + productDescription
				+ ", quantityInStock=" + quantityInStock + ", buyPrice=" + buyPrice + ", MSRP=" + MSRP
				+ ", productlines=" + productlines + ", orderdetails=" + orderdetails + "]";
	}

		
	
}
