package com.spring.domain;

import lombok.Data;

@Data
public class BoardVO {

	private Long num;
	private String id;
	private String name;
	private String subject;
	private String content;
	private String regist_day;
	private Long hit;
	private String ip;
}
