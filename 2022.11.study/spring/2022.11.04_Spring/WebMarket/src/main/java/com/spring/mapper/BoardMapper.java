package com.spring.mapper;

import java.util.ArrayList;

import com.spring.domain.BoardVO;

public interface BoardMapper {

	public ArrayList<BoardVO> getList();
	
	//게시판 조회
	public BoardVO read(Long num);
	
	//게시물 총 개수
	public int getTotalCount();
	
	//게시판 등록
	public void insert(BoardVO board);
}
