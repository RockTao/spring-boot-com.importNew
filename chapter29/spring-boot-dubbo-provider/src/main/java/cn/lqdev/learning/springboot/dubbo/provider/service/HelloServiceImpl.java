package cn.lqdev.learning.springboot.dubbo.provider.service;


import com.alibaba.dubbo.config.annotation.Service;

import cn.lqdev.learning.springboot.dubbo.api.IHelloService;
import lombok.extern.slf4j.Slf4j;

@Service(
		version = "${demo.service.version}", //版本
		application = "${dubbo.application.id}", //应用ID
		protocol = "${dubbo.protocol.id}", //协议id
		registry = "${dubbo.registry.id}")//注册中心id
@Slf4j
public class HelloServiceImpl implements IHelloService {
	
	public String hello(String name) {
		log.info("dubbo提供者，参数name:{}", name);
		return "hello " + name + ",this is a dubbo provider!";
	}

}