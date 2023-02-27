package com.example.Playersdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Playersdemo.Dto.PlayerDto;
import com.example.Playersdemo.service.PlayerService;

@RestController
public class PlayerController {
	
	@Autowired
	private PlayerService playerService;
	
	
	@PostMapping("/players")
	public PlayerDto save(@RequestBody PlayerDto playerDto) {
		return playerService.save(playerDto);
		
		
		
	}

}
