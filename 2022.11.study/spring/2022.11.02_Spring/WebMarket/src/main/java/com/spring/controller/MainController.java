package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j;

@Controller
@Log4j
@RequestMapping("/*")
public class MainController {

	@GetMapping("/index")
	public void index() {
		
	}
	
	@GetMapping("/index/list")
	public String list() {
		
		return "redirect:/board/list";
	}
}
