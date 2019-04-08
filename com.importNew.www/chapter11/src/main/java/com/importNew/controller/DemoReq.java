package com.importNew.controller;

import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DemoReq {

	String code;
	
	String name;
	
	String remark;
}