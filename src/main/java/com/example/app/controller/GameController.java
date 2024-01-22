package com.example.app.controller;

import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.app.domain.Game;
import com.example.app.mapper.GameMapper;

import lombok.RequiredArgsConstructor;

@org.springframework.stereotype.Controller
@RequiredArgsConstructor
public class GameController {
	
	private final GameMapper mapper;
	
	//試合一覧の表示
	@GetMapping("/games")
	public String showGame(Model model) throws Exception{
		List<Game> games = mapper.selectAll();
		model.addAttribute("games",games);
	return "game";
	}

}
