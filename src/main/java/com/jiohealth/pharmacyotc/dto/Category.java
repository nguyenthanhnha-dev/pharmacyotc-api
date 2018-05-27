package com.jiohealth.pharmacyotc.dto;

public class Category {
	
	private int categoryId;
	
	private String name;
	
	private String imageURL;
	
	public Category() {
	}

	public Category(int categoryId, String name) {
		this.categoryId = categoryId;
		this.name = name;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImageURL() {
		return imageURL;
	}

	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}
	
}
