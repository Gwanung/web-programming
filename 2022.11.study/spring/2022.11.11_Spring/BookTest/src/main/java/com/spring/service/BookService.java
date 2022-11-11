package com.spring.service;

import java.util.ArrayList;

import com.spring.domain.BookDTO;

public interface BookService {
	
	public ArrayList<BookDTO> getList();
	
	public void register(BookDTO dto);
	
}
