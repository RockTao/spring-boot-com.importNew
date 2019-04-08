package com.importnew.filterNew.controller;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.importnew.filterNew.Do.DemoReq;


@RestController
public class demoValid {
	
	@GetMapping("/demo/valid")
	public String demoValid(@Valid DemoReq req) {
	    return req.getCode() + "," + req.getName();
	}

}
