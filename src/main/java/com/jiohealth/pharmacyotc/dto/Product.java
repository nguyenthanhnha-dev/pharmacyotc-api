package com.jiohealth.pharmacyotc.dto;

public class Product {
	
	private int productId;
	
	private String name;
	
	private String shortDescription;
	
	private String longDescription;
	
	private double price;
	
	private int categoryId;

	public Product(int productId, String name, String shortDescription, String longDescription, double price,
			int categoryId) {
		this.productId = productId;
		this.name = name;
		this.shortDescription = shortDescription;
		this.longDescription = longDescription;
		this.price = price;
		this.categoryId = categoryId;
	}

	public Product() {
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

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getLongDescription() {
		return longDescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

}
