package com.spring.service;

import java.util.List;

import com.spring.domain.BookDTO;

public interface BookService {
	
	public List<BookDTO> getList();
	
	public void register(BookDTO dto);
	
}
