package com.importNew;

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
public class Chapter16Application {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Chapter16Application.class, args);
		log.info("chapter16 服务启动");
	}

}