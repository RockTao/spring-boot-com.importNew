package com.chapter13;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;


/**
 * Swagger2集成及使用
 * @author xiedeshou
 *
 */
@SpringBootApplication
@Slf4j
public class Chapter13Application {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Chapter13Application.class, args);
		log.info("chapter13 服务启动");
	}

}