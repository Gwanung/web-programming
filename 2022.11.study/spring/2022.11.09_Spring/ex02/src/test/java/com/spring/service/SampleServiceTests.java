package com.spring.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class SampleServiceTests {

	@Autowired
	private SampleTxService service;

	@Test
	public void testLong() {
		
		//tbl1에는 50바이트가 넘어도 추가가 되지만 tbl2에서는 추가가 되지 않음! (길이 제한)

		String str = "Starry\r\n" + 
					"Starry night\r\n" + 
					"Paint your palette blue and grey\r\n"+ 
					"Look out on a summer's day";

		log.info(str.getBytes().length);
		service.addData(str);
	}
}
