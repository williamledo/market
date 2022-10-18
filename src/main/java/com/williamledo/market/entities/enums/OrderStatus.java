package com.williamledo.market.entities.enums;

public enum OrderStatus {

	WAITING_PAYMENT(1),
	PAID(2),
	SHIPPED(3),
	DELIVERED(4),
	CANCELED(5);

	private int code;
	
	private OrderStatus(int code) {
		this.code = code;
	}
	
	//Converte de OrderStatus para inteiro
	public int getCode() {
		return code;
	}
	
	
	//Converte de inteiro para OrderStatus
	public static OrderStatus valueOf(int code) {
		
		for (OrderStatus value : OrderStatus.values()) {
			if(value.getCode() == code) {
				return value;
			}
		}
		throw new IllegalArgumentException("Invalid OrderStatus code");
	}
	
}