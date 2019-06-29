package com.guruji.demoProject1;

import org.springframework.hateoas.ResourceSupport;

//Adding Hypermedia Support to a Resource
/*Spring HATEOAS project provides a base class called ResourceSupport to 
 * inherit from when creating resource representation.Spring HATEOAS project 
 * provides a base class called ResourceSupport to inherit from when creating
 *  resource representation.*/
public class SampleHateoasVO extends ResourceSupport{
	 private String customerId;
	 private String customerName;
	 private String companyName;
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	@Override
	public String toString() {
		return "SampleHateoasVO [customerId=" + customerId + ", customerName=" + customerName + ", companyName="
				+ companyName + "]";
	}	
}
