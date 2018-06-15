package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.dao.GuitarDao;
import com.example.entity.Guitar;

@Controller
public class GuitarController {
	@Autowired
	private GuitarDao guitarDao;
	
	@PostMapping("/add")
	public String add(Guitar guitar){
		guitarDao.save(guitar);
		return "redirect:/";
	}
	
	@GetMapping("/")
	public String findAll(Model model){
		model.addAttribute("list", guitarDao.findAll());
		return "list.ftl";
	}
	
	
}
