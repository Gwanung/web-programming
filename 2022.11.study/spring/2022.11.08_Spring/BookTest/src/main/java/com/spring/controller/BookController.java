package com.spring.controller;

import java.net.URI;
import java.nio.charset.Charset;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.spring.service.BookService;

@RestController
@RequestMapping(value = "/naver-api", produces = "application/json; charset= UTF-8;")
public class BookController {
@GetMapping("/search")
public String naver(){

    URI uri = UriComponentsBuilder
            .fromUriString("https://openapi.naver.com")
            .path("/v1/search/book.json")
            .queryParam("query","자바")
            .queryParam("display",10)
            .queryParam("start",1)
            .queryParam("sort","sim")
            .encode() // 여기서 query 내용 encoding 해줌
            .build()
            .toUri();

    RestTemplate restTemplate = new RestTemplate();  //Rest api호출 내장 클래스

    RequestEntity<Void> req = RequestEntity
            .get(uri)
            .header("X-Naver-Client-Id","YW2vH7RGW8B1W9bWgJMP")
            .header("X-Naver-Client-Secret","2O9Vl4ysld")
            .build();

    ResponseEntity<String> result = restTemplate.exchange(req, String.class);

    return result.getBody();
}

	@Autowired
	private BookService service;
	
	@GetMapping("/bookList")
	public void list(Model model) {
		model.addAttribute(service.getList());
	}



}
