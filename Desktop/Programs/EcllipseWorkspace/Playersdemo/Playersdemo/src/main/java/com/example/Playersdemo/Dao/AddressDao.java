package com.example.Playersdemo.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Playersdemo.entity.Address;

public interface AddressDao extends JpaRepository<Address, String>{

}