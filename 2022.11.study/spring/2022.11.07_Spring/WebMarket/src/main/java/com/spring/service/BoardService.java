package com.spring.service;

import java.util.ArrayList;

import com.spring.domain.BoardVO;

public interface BoardService {

	public ArrayList<BoardVO> getList();
	public String getLoginNameById(String id);
	public void insertBoard(BoardVO board);
	public void updateHit(Integer num);
	public BoardVO getBoardByNum(Integer num);
	public void updateBoard(BoardVO board);
	public void deleteBoard(Integer num);
	//게시판 조회
	public BoardVO get(Long num); 
	//게시판 총 개수
	public Integer getTotal();
	//게시판 등록
	public void register(BoardVO vo);
}
