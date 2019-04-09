package com.chapter13.service;

import org.springframework.stereotype.Service;

@Service
public class UnitTestServiceImpl implements UnitTestService {

	@Override
	public String process(String msg) {
		return msg;
	}

}
