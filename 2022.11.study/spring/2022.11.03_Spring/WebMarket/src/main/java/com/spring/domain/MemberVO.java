package com.spring.domain;

import lombok.Data;

@Data
public class MemberVO {
	
	private String id;
	private String password;
	private String name;
	private String gender;
	private String birth;
	private String mail;
	private String phone;
	private String address;
	private String regist_day;
}
