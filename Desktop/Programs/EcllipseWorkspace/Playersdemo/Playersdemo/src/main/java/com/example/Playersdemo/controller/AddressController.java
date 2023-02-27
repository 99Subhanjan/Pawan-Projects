package com.example.Playersdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Playersdemo.Dto.AddressDto;
import com.example.Playersdemo.service.AddressService;

@RestController
public class AddressController {
	
	@Autowired
	private AddressService addressService;
	
	
	@PostMapping("/address")
	public AddressDto saveAddress(@RequestBody AddressDto addressDto) {
		return addressService.saveAddress(addressDto);
	
		
	}
	

}
