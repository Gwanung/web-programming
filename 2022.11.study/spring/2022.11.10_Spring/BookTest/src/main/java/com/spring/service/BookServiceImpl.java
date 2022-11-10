package com.spring.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.domain.BookDTO;
import com.spring.mapper.BookMapper;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Service
@AllArgsConstructor
@Log4j
public class BookServiceImpl implements BookService{

	private BookMapper mapper; 
	
	@Override
	public List<BookDTO> getList() {
		return mapper.getList();
	}
	//책 api 데이터 등록
	@Override
	public void register(BookDTO dto) {
		mapper.insert(dto);
	}

}
