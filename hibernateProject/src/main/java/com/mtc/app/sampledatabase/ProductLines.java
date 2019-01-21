package com.mtc.app.sampledatabase;

import java.sql.Blob;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="productlines")
public class ProductLines {

	@Id
	private String productLine;
	private String textDescription;
	private Blob image;
	private String htmlDescription;
	
//	mapped by "table name" in one side
	@OneToMany(mappedBy="productlines")
//	set<clsname at many side> table name at many side
	private Set<Products> products;
	
	public ProductLines() {
		super();
	}

	public ProductLines(String productLine, String textDescription, Blob image, String htmlDescription,
			Set<Products> products) {
		super();
		this.productLine = productLine;
		this.textDescription = textDescription;
		this.image = image;
		this.htmlDescription = htmlDescription;
		this.products = products;
	}

	public String getProductLine() {
		return productLine;
	}

	public void setProductLine(String productLine) {
		this.productLine = productLine;
	}

	public String getTextDescription() {
		return textDescription;
	}

	public void setTextDescription(String textDescription) {
		this.textDescription = textDescription;
	}

	public Blob getImage() {
		return image;
	}

	public void setImage(Blob image) {
		this.image = image;
	}

	public String getHtmlDescription() {
		return htmlDescription;
	}

	public void setHtmlDescription(String htmlDescription) {
		this.htmlDescription = htmlDescription;
	}

	public Set<Products> getProducts() {
		return products;
	}

	public void setProducts(Set<Products> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "ProductLines [productLine=" + productLine + ", textDescription=" + textDescription + ", image=" + image
				+ ", htmlDescription=" + htmlDescription ;
	}

	

	
}
