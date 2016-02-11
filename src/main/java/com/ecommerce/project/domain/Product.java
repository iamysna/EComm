package com.ecommerce.project.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="product")
public class Product {
	
	@Id
	@GenericGenerator(strategy="increment" ,name="myGenerator")
	@GeneratedValue(generator="myGenerator")
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
