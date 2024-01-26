package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="customer")
public class CustomerData {
	private String customerid;
	private String name;
	private String email;

}
