package com.spring.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.spring.domain.BoardVO;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardServiceTests {
	//내부적으로 객체 생성
	@Autowired
	private BoardService service;
	
	@Test
	public void testPrint() {
		
		log.info(service);
	}

	@Test
	public void testRegister() {
		BoardVO vo = new BoardVO();
		vo.setTitle("Test");
		vo.setContent("Content test");
		vo.setWriter("tester");
		service.register(vo);
		log.info("생성된 게시물의 번호 : " + vo.getBno());
	}
	
	@Test
	public void testGet() {
		log.info(service.get(1L));
	}
	
	@Test
	public void testDelete() {
		log.info("remove : " + service.remove(2L));
	}
	
	@Test
	public void testUpdate() {
		BoardVO vo = new BoardVO();
		if(vo == null) 
			return;
		vo.setTitle("제목 수정");
		log.info("modify : " + service.modify(vo));
		
	}
}
