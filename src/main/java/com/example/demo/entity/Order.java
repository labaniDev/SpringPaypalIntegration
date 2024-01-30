package com.example.demo.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Order {
	private double price;
	private String currency;
	private String method;
	private String intent;
	private String description;

}
