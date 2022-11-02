package com.spring.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.domain.SampleVO;
import com.spring.domain.Ticket;

import lombok.extern.log4j.Log4j;

@RestController
@RequestMapping("/sample")
@Log4j
public class SampleController2 {

	@GetMapping(value = "/getSample", produces = { MediaType.APPLICATION_JSON_UTF8_VALUE,
			MediaType.APPLICATION_XML_VALUE })
	public SampleVO getSample() {

		return new SampleVO(112, "스타", "로드");
	}

	@GetMapping(value = "/getList")
	public List<SampleVO> getList() {
		// 범위는 1부터 10 미만까지 루프 처리! | mapToObj 는 객체 스트림으로 변경시켜주는 역할
		return IntStream.range(1, 10).mapToObj(i -> new SampleVO(i, i + "First", i + "Last"))
				.collect(Collectors.toList());
	}

	@GetMapping(value = "/getMap")
	public Map<String, SampleVO> getMap() {
		Map<String, SampleVO> map = new HashMap<>();
		map.put("First", new SampleVO(110, "그루트", "주니어"));
		map.put("Second", new SampleVO(111, "스타", "로드"));

		return map;
	}

	@GetMapping(value = "/check", params = { "height", "weight" })
	public ResponseEntity<SampleVO> check(Double height, Double weight) {

		SampleVO vo = new SampleVO(0, "" + height, "" + weight);
		ResponseEntity<SampleVO> result = null;

		if (height < 150)
			result = ResponseEntity.status(HttpStatus.BAD_GATEWAY).body(vo);
		else
			result = ResponseEntity.status(HttpStatus.OK).body(vo);

		return result;
	}
	//{}로 처리된 부분은 컨트롤러의 메소드에서 변수로 처리가 가능함.
	@GetMapping("/product/{cat}/{pid}")
	public String[] getPath(@PathVariable("cat") String cat, @PathVariable("pid") String pid) {
		
		return new String[] {"category : " + cat, "productid : " + pid};
	}
	// Json 데이터를 원하는 타입의 객체로 변환해야 하는 경우에 주로 사용함. postmapping 사용 (요청된 내용을 처리하기 떄문에 일반적인 파라미터 전달방식을 사용 x)
	// RestController 테스트는 Rest방식 툴, JUnit과 spring-test를 이용해서 하는데 이 방식은 후자로 진행
	@PostMapping("/ticket")
	public Ticket convert(@RequestBody Ticket ticket) {
		log.info("convert............" + ticket);
		
		return ticket;
	}
	

}
