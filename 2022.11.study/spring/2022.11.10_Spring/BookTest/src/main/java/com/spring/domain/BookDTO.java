package com.spring.domain;

import java.util.Date;
import lombok.Data;

//책 정보
@Data
public class BookDTO {

	private Long bno; // 책 번호 (등록순, seq 사용)
	private String author; // 책 저자
	private String title; // 책 제목
	private Long discount; // 책 가격
	private Date pubdate;  // 출판일
	private Long isbn; // 책 고유번호 
	private String image;  //이미지 경로
}
