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
	public void updateHit(int num) {
		
	}

	@Override
	public BoardVO getBoardByNum(int num) {
		return null;
	}

	@Override
	public void updateBoard(BoardVO board) {
		
	}

	@Override
	public void deleteBoard(int num) {
		
	}

}
