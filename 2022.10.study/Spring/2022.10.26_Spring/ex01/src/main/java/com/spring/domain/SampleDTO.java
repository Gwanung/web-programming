package com.spring.domain;

import lombok.Data;


//@Date는 getter/setter/eqauls/toString 와 같은 메소드를 자동 생성 해줌! 
@Data
public class SampleDTO {
	
	private String name;
	private int age;
}
