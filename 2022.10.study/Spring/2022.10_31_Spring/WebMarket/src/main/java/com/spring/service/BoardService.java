package com.spring.service;

import java.util.ArrayList;

import com.spring.domain.BoardVO;

public interface BoardService {

	public ArrayList<BoardVO> getList();
	public String getLoginNameById(String id);
	public void insertBoard(BoardVO board);
	public void updateHit(int num);
	public BoardVO getBoardByNum(int num);
	public void updateBoard(BoardVO board);
	public void deleteBoard(int num);
	
	
}
