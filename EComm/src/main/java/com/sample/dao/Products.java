package com.sample.dao;

public class Products {
	private String productId;
	private String productName;
	private float price;
	private String description;
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Products [productId=" + productId + ", productName="
				+ productName + ", price=" + price + ", description="
				+ description + "]";
	}
	
	
	

}
