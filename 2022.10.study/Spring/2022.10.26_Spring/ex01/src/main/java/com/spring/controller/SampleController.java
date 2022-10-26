package com.spring.controller;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring.domain.SampleDTO;
import com.spring.domain.SampleDTOList;
import com.spring.domain.TodoDTO;

import lombok.extern.log4j.Log4j;

@Controller
//sample로 시작하는 url 경로는 모두 여기서 처리한다는 의미
@RequestMapping("/sample/*")
@Log4j
public class SampleController {

	@RequestMapping(value = "/basic", method = { RequestMethod.GET, RequestMethod.POST })
	public void basic() {
		log.info("basic........................");
	}

	@GetMapping("/basicGET")
	public void basicGet() {
		log.info("basicGET........................");
	}
	
	@GetMapping("/ex01")
	public String ex01(SampleDTO dto) {
		log.info("" + dto);
		return "ex01";
	}
	
	@GetMapping("/ex02")
	public String ex02(@RequestParam("name") String name, @RequestParam("age") int age) {
		log.info("name : " + name);
		log.info("age : " + age); 
		return "ex02";
	}
	
	@GetMapping("/ex02List")
	public String ex02List(@RequestParam("ids")ArrayList<String> ids) {
		 
		log.info("ids : " + ids);
		return "ex02List";
	}
	@GetMapping("/ex02Array")
	public String ex02Array(@RequestParam("ids") String[] ids) {
		log.info("array ids: " + Arrays.toString(ids));
		return "ex02Array";
  }
//	/sample/ex02Bean?list[0].name=aaa&list[0].age=15
//	/sample/ex02Bean?list%5B0%5D.name=aaa&list%5B0%5D.age=15
	@GetMapping("/ex02Bean")
	public void ex02Bean(SampleDTOList list) {
		log.info("...list: " + list);
	}
//	/sample/ex03?title=test&dueDate=2022/10/26
	@GetMapping("/ex03")
	public void ex03(TodoDTO todo) {
		log.info("todo: " + todo);
	}
	@GetMapping("/ex04")
	public String ex04(SampleDTO dto,@ModelAttribute("page") int page) {
		log.info("dto: " + dto);
		log.info("page:" + page);
		return "/sample/ex04";
	}
	@GetMapping("/ex06")
	public@ResponseBody SampleDTO ex06() {
		log.info("/ex06.............");
		SampleDTO dto = new SampleDTO();
		dto.setAge(10);
		dto.setName("홍길동");
		
		return dto;
	}
	
	@GetMapping("/ex07")
	public ResponseEntity<String> ex07(){
		
		log.info("/ex07...........");
		String msg = "{\"name\": \"홍길동\"}";
		HttpHeaders header = new HttpHeaders();
		header.add("Content-Type", "application/json;charset=UTF-8");
		
		
		return new ResponseEntity<>(msg, header, HttpStatus.OK);
	}
}
