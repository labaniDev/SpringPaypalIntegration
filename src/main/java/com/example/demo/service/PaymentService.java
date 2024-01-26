package com.example.demo.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.example.demo.entity.CustomerData;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.Customer;


@Service
public class PaymentService {
	   @Value("${stripe.apikey}")
	   String stripeKey;
	
	public CustomerData createCustomer(CustomerData data) throws StripeException {
		Stripe.apiKey=stripeKey;
		Map<String,Object> params=new HashMap<>();
		params.put("name", data.getName());
		params.put("email", data.getEmail());
		Customer customer=Customer.create(params);
		data.setCustomerid(customer.getId());
		return data;
	}
	
	

}
