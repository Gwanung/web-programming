package com.spring.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.domain.BoardVO;
import com.spring.mapper.BoardMapper;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
@AllArgsConstructor
public class BoardServiceImpl implements BoardService{
	
	@Autowired
	private BoardMapper mapper;


	@Override
	public ArrayList<BoardVO> getList() {
		return mapper.getList();
	}

	@Override
	public String getLoginNameById(String id) {
		return null;
	}

	@Override
	public void insertBoard(BoardVO board) {
		
	}

	@Override
	public void updateHit(Integer num) {
		
	}

	@Override
	public BoardVO getBoardByNum(Integer num) {
		return null;
	}

	@Override
	public void updateBoard(BoardVO board) {
		
	}

	@Override
	public void deleteBoard(Integer num) {
		
	}
	//게시판 조회
	@Override
	public BoardVO get(Long num) {
		return mapper.read(num);
	}

	//게시판 총 개수
	@Override
	public Integer getTotal() {
		return mapper.getTotalCount();
	}
	//게시판 등록
	@Override
	public void register(BoardVO vo) {
		mapper.insert(vo);
	}
	

}
