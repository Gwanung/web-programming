package com.spring.controller;
//Rest방식 사용

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.service.ReplyService;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@RequestMapping("/replies")
//Rest방식의 컨트롤러
@RestController
@Log4j
@AllArgsConstructor
public class ReplyController {

	private ReplyService service;
}
