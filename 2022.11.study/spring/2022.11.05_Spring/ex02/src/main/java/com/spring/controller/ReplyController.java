package com.spring.controller;
//Rest방식 사용

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.domain.Criteria;
import com.spring.domain.ReplyPageDTO;
import com.spring.domain.ReplyVO;
import com.spring.service.ReplyService;

import lombok.extern.log4j.Log4j;

@RequestMapping("/replies")
//Rest방식의 컨트롤러
@RestController
@Log4j
public class ReplyController {
	@Autowired
	private ReplyService service;

	//댓글 등록 및 테스트
	@PostMapping(value = "/new", consumes = "application/json", produces = { MediaType.TEXT_PLAIN_VALUE })
	public ResponseEntity<String> create(@RequestBody ReplyVO vo) {
		log.info("ReplyVO : " + vo);
		int insertCount = service.register(vo);
		log.info("insertCount : " + insertCount);
		return insertCount == 1 ? new ResponseEntity<String>("success", HttpStatus.OK)
				: new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
//
//	//특정 게시물의 댓글 목록 확인
//	@GetMapping(value="/pages/{bno}/{page}",
//				produces = {MediaType.APPLICATION_JSON_UTF8_VALUE,
//						MediaType.APPLICATION_XML_VALUE})
//	public ResponseEntity<List<ReplyVO>> getList(@PathVariable("page") int page, @PathVariable("bno") Long bno){
//		log.info("getList---------");
//		Criteria cri = new Criteria(page, 10);
//		log.info(cri);
//		
//		return new ResponseEntity<>(service.getList(cri, bno), HttpStatus.OK);
//	}
	
	//댓글 조회
	@GetMapping(value = "/{rno}",
			produces = {MediaType.APPLICATION_JSON_UTF8_VALUE,
					MediaType.APPLICATION_XML_VALUE})
	public ResponseEntity<ReplyVO> get(@PathVariable("rno") Long rno){
		log.info("get_rno : " + rno);

		return new ResponseEntity<>(service.get(rno), HttpStatus.OK);
	}
	
	//댓글 수정
	@RequestMapping(method = {RequestMethod.PUT, RequestMethod.PATCH},
			value = "/{rno}",
			consumes = "application/json",
			produces = {MediaType.TEXT_PLAIN_VALUE})
	public ResponseEntity<String> modify(@RequestBody ReplyVO vo, @PathVariable("rno") Long rno){
		vo.setRno(rno);
		log.info("modify_rno : " + vo);
		log.info("Replyvo : " + vo);
		return service.modify(vo)==1? new ResponseEntity<>("success", HttpStatus.OK)
				: new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR); 
	}
	
	
	
	//댓글 삭제 (url은 get방식이 기본)
	@DeleteMapping(value = "/{rno}",
			produces =  MediaType.TEXT_PLAIN_VALUE)
	public ResponseEntity<String> remove(@PathVariable("rno") Long rno){
		log.info("remove_rno : " + rno);
		return service.remove(rno)==1? new ResponseEntity<String>("success", HttpStatus.OK)
				: new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	//댓글 페이징 처리
	//특정 게시물의 댓글 목록 확인
	@GetMapping(value = "/pages/{bno}/{page}",
				produces = {MediaType.APPLICATION_XML_VALUE,
						MediaType.APPLICATION_JSON_UTF8_VALUE})
	public ResponseEntity<ReplyPageDTO> getList(@PathVariable("page") int page, @PathVariable("bno") Long bno){
		Criteria cri = new Criteria(page, 10);
		log.info("get Reply List bno : " + bno);
		log.info("cri " + cri);
		
		
		return new ResponseEntity<>(service.getListPage(cri, bno), HttpStatus.OK);
	}
				
	
	
	
	
	
	
	
	
	
}
