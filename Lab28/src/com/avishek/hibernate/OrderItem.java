package com.avishek.hibernate;



public class OrderItem {
	private int oiid;
	private int qty;
	private double cost;
	
	private Order order;
	private Book book;
	
	public OrderItem(){}
	
	
	public OrderItem(int oiid, int qty, double cost) {
		this.oiid = oiid;
		this.qty = qty;
		this.cost = cost;
	}
	
	public OrderItem(int qty, double cost) {
		this.qty = qty;
		this.cost = cost;
	}


	public int getOiid() {
		return oiid;
	}


	public void setOiid(int oiid) {
		this.oiid = oiid;
	}


	public int getQty() {
		return qty;
	}


	public void setQty(int qty) {
		this.qty = qty;
	}


	public double getCost() {
		return cost;
	}


	public void setCost(double cost) {
		this.cost = cost;
	}


	public Order getOrder() {
		return order;
	}


	public void setOrder(Order order) {
		this.order = order;
	}


	public Book getBook() {
		return book;
	}


	public void setBook(Book book) {
		this.book = book;
	}


	@Override
	public String toString() {
		return "OrderItem [oiid=" + oiid + ", qty=" + qty + ", cost=" + cost + ", order=" + order + ", book=" + book
				+ "]";
	}
	
	
	
}