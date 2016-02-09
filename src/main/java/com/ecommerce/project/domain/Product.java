package com.ecommerce.project.domain;

public class Product {
	
	private Integer prooductId;
	private String productName;
	private String description;
	private Double price;
	/**
	 * @return the prooductId
	 */
	public Integer getProoductId() {
		return prooductId;
	}
	/**
	 * @param prooductId the prooductId to set
	 */
	public void setProoductId(Integer prooductId) {
		this.prooductId = prooductId;
	}
	/**
	 * @return the productName
	 */
	public String getProductName() {
		return productName;
	}
	/**
	 * @param productName the productName to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the price
	 */
	public Double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(Double price) {
		this.price = price;
	}
	

}
