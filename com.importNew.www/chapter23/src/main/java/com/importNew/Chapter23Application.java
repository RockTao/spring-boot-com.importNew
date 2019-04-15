package com.importNew;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

import lombok.extern.slf4j.Slf4j;


/**
 * Swagger2集成及使用
 * @author xiedeshou
 *
 */
@SpringBootApplication
@EnableAsync
@Slf4j
public class Chapter23Application {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Chapter23Application.class, args);
		log.info("chapter23--- 服务启动");
	}

}