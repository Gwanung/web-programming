package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.spring.domain.BoardVO;
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
		// model.addAttribute -> model에서 view로 값 넘겨주는법 ex) 파라미터 값 = (넘겨줄이름 , 실행할 메소드)
		model.addAttribute("list", service.getList());
		model.addAttribute("count", service.getTotal());
	}
	
	// 조회
	@GetMapping({ "/get", "/modify" })
	public void get(Long num , Model model) {
		log.info("get or modify");
		model.addAttribute("board", service.get(num));
	}
	
	
	//등록
	@GetMapping("/register")
	public void register() {
		
	}
	
//	@PostMapping("/register")
//	public String register(BoardVO board, RedirectAttributes rttr) {
//		log.info("register : " + board);
//		service.register(board);
//		rttr.addFlashAttribute("result", board.getNum());
//		return "redirect:/board/list";
//	}
}
