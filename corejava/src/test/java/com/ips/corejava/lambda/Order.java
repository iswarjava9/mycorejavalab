package com.ips.corejava.lambda;

public class Order {
	
	private int orderId;
	private String desc;
	
	public Order(int orderId, String desc) {
		super();
		this.orderId = orderId;
		this.desc = desc;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	

}
