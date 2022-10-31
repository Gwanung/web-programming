package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.spring.service.BoardService;

import lombok.extern.log4j.Log4j;

@Controller
@Log4j
//board로 시작하는 url 경로는 모두 여기서 처리한다는 의미
@RequestMapping("/board/*")
public class BoardController {

	@Autowired
	private BoardService service;
	
	@GetMapping("/list")
	public void list(Model model) {
		//model.addAttribute -> model에서 view로 값 넘겨주는법 ex) 파라미터 값 = (넘겨줄이름 , 실행할 메소드) 
		model.addAttribute("list", service.getList());
	}
	
}
