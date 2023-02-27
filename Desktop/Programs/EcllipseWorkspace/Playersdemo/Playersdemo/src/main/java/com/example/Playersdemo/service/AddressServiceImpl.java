package com.example.Playersdemo.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Playersdemo.Dao.AddressDao;
import com.example.Playersdemo.Dto.AddressDto;
import com.example.Playersdemo.entity.Address;
@Service
public class AddressServiceImpl implements AddressService{
	
	@Autowired
	private AddressDao addressDao;

	@Override
	public AddressDto saveAddress(AddressDto addressDto) {
		// TODO Auto-generated method stub
		Address address = new Address();
		address.setStreetName(addressDto.getStreetName());
		address.setCity(addressDto.getCity());
		address.setState(addressDto.getState());
		address.setZipcode(addressDto.getZipcode());
		address.setCountry(addressDto.getCountry());
		
		
		Address dbAddress = addressDao.save(address);
		
		AddressDto respdto = new AddressDto();
		respdto.setStreetName(dbAddress.getStreetName());
		respdto.setCity(dbAddress.getCity());
		respdto.setState(dbAddress.getState());
		respdto.setZipcode(dbAddress.getZipcode());
		respdto.setCountry(dbAddress.getCountry());
		
		
		return respdto;
		
		
		
	}

	

}
