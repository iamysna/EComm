package com.ecommerce.project.domain;

/**
 * 
 * @author Ravi
 * @since 8-2-2016
 * @version 1.0
 *
 */

public class Customer {
	
	private Integer customerId;
	private Integer productId;
	/**
	 * @return the customerId
	 */
	public Integer getCustomerId() {
		return customerId;
	}
	/**
	 * @param customerId the customerId to set
	 */
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	/**
	 * @return the productId
	 */
	public Integer getProductId() {
		return productId;
	}
	/**
	 * @param productId the productId to set
	 */
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	
	

}
