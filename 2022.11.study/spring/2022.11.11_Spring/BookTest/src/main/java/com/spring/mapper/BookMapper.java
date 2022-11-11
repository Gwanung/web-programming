package com.spring.mapper;

import java.util.ArrayList;

import com.spring.domain.BookDTO;

public interface BookMapper {

	public ArrayList<BookDTO> getList(); //book list
	
	public void insert(BookDTO dto);  // DB 저장

}
