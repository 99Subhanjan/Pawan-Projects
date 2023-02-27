package com.example.Playersdemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Playersdemo.Dao.PlayerDao;
import com.example.Playersdemo.Dto.PlayerDto;
import com.example.Playersdemo.entity.Player;

@Service
public class PlayerServiceImpl implements PlayerService{
	
	@Autowired
	private PlayerDao playerDao;

	@Override
	public PlayerDto save(PlayerDto playerDto) {
		// TODO Auto-generated method stub
		
		Player player = new Player();
		player.setId(playerDto.getId());
		player.setName(playerDto.getName());
		player.setPlayerType(playerDto.getPlayerType());
		player.setAge(playerDto.getAge());
		player.setAddress(playerDto.getAddress());
		
		
		Player dbPlayer = playerDao.save(player);
		
		PlayerDto resPlayerDto = new PlayerDto();
		resPlayerDto.setId(dbPlayer.getId());
		resPlayerDto.setName(dbPlayer.getName());
		resPlayerDto.setPlayerType(dbPlayer.getPlayerType());
		resPlayerDto.setAge(dbPlayer.getAge());
		resPlayerDto.setAddress(dbPlayer.getAddress());

		
		return resPlayerDto;
	}

}
