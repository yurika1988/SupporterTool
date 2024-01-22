package com.example.app.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.app.domain.Mom;
import com.example.app.mapper.MomMapper;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller
public class MomController {
	
private final MomMapper mapper;
	
	//試合一覧の表示
	@GetMapping("/mom")
	public String showMom(Model model) throws Exception{
		List<Mom> mom = mapper.selectAll();
		model.addAttribute("mom",mom);
	return "mom";
	}

}
