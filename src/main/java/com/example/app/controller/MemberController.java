package com.example.app.controller;

import java.util.List;

import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.app.domain.Member;
import com.example.app.mapper.MemberMapper;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@org.springframework.stereotype.Controller
@RequiredArgsConstructor
public class MemberController {
	
	private final MemberMapper mapper;
	
	//会員一覧の表示
	@GetMapping("/members")
	public String showMembers(Model model) throws Exception{
		List<Member> members = mapper.selectAll();
		model.addAttribute("members",members);
	return "members";
	}
	//会員追加フォームの表示
	@GetMapping("add")
	public String add(Model model) throws Exception{
		Member member = new Member();
		model.addAttribute("member",member);
		return "membersAdd";		
	}
    //会員の追加
	@PostMapping("add")
	public String add(@Valid Member member, Errors errors) throws Exception {
	if(errors.hasErrors()) {
	return "membersAdd";
	}
	mapper.add(member);
	return "redirect:/";
	}


}
