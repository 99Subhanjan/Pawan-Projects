package com.example.Playersdemo.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Playersdemo.entity.Player;

public interface PlayerDao extends JpaRepository<Player, Integer>{

}
