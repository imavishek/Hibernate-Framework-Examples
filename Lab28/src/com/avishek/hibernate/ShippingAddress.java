package com.avishek.hibernate;

public class ShippingAddress {
	private int addid;
	private String street;
	private String city;
	private String state;
	
	private Order order;
	
	
	public ShippingAddress(){}
	
	
	public ShippingAddress(int addid, String street, String city, String state) {
		this.addid = addid;
		this.street = street;
		this.city = city;
		this.state = state;
	}
	
	public ShippingAddress(String street, String city, String state) {
		this.street = street;
		this.city = city;
		this.state = state;
	}


	public int getAddid() {
		return addid;
	}


	public void setAddid(int addid) {
		this.addid = addid;
	}


	public String getStreet() {
		return street;
	}


	public void setStreet(String street) {
		this.street = street;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public Order getOrder() {
		return order;
	}


	public void setOrder(Order order) {
		this.order = order;
	}


	@Override
	public String toString() {
		return "ShippingAddress [addid=" + addid + ", street=" + street + ", city=" + city + ", state=" + state
				+ ", order=" + order + "]";
	}

	
}
