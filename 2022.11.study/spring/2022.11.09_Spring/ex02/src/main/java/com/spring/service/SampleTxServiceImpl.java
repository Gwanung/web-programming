package com.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.mapper.Sample1Mapper;
import com.spring.mapper.Sample2Mapper;

import lombok.extern.log4j.Log4j;

@Service
@Log4j
public class SampleTxServiceImpl implements SampleTxService{
	@Autowired
	private Sample1Mapper mapper1;
	@Autowired
	private Sample2Mapper mapper2;
	
	//양쪽에 데이터가 정상적으로 들어가지 않을 경우(한쪽만 들어가는 경우) 다른 하나를 롤백해서 둘다 데이터가 들어가지 않도록 해줌!
	@Transactional
	@Override
	public void addData(String value) {
		log.info("mapper1..................");
		mapper1.insertCol1(value);
		log.info("mapper2..................");
		mapper2.insertCol2(value);
		
		log.info("end........................");
	}

}
