package com.spring.domain;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class BookDTO {

	private String query;
	private Integer display;
	private Integer start;
	private String sort;
	

}
