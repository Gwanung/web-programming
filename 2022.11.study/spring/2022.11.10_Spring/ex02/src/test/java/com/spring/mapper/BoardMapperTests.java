package com.spring.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.spring.domain.BoardVO;
import com.spring.domain.Criteria;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardMapperTests {

	@Autowired
	private BoardMapper mapper;

	@Test
	public void testGetBoard() {
		log.info("------------------");
		mapper.getList();
	}
	
	@Test
	public void testPaging() {
		log.info("------------------");
		mapper.getListWithPaging(new Criteria(1, 10));
	}
	

	
	
//	create(insert) 1번째 방법
	@Test
	public void testInsert() {
		BoardVO board = new BoardVO();
		board.setTitle("새로 작성하는 글");
		board.setContent("새로 작성하는 내용");
		board.setWriter("newbie");

		mapper.insert(board);
		// Lombok의 toString을 이용해 bno의 값을 알아보기 위함.
		log.info("==after insert: " + board.getBno());
	}
//	create(insert) 2번째 방법
	@Test
	public void testInsertSelectKey() {
		BoardVO board = new BoardVO();
		board.setTitle("새 글");
		board.setContent("새 내용");
		board.setWriter("newbie2");

		mapper.insertSelectKey(board);
		log.info("==after insertSelectKey: " + board.getBno());
	}
	
	//read(select)
	@Test
	public void testRead() {
		BoardVO board = mapper.read(2L);
		log.info("==select read: " + board.getBno());
	}
	
	//delete
	@Test
	public void testDel() {
		int count = mapper.delete(1L);
		log.info("=============" + count);
	}
	//update
	@Test
	public void testUpdate() {
		
		BoardVO board = new BoardVO();
		board.setBno(2L);
		board.setTitle("update title");
		board.setContent("update content");
		board.setWriter("user02");
		log.info("======testUpdate : " + mapper.update(board));
	}
	
	@Test
	public void testSearch() {
		log.info("-------------------");
		Criteria cri = new Criteria();
		cri.setKeyword("새");
		cri.setType("TCW");
		mapper.getListWithPaging(cri);
	}
	
	
}//BoardMapperTests















