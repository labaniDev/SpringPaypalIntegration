package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.CustomerData;
import com.example.demo.service.PaymentService;
import com.stripe.exception.StripeException;


@RestController
@RequestMapping("/api")
public class PaymentController {
	@Autowired
	PaymentService paymentService;
	@PostMapping("/createCustomer")
	public ResponseEntity createCustomer(@RequestBody CustomerData customerData) throws StripeException {
		paymentService.createCustomer(customerData);
		return new ResponseEntity(HttpStatus.CREATED);
		
	}
	

}
