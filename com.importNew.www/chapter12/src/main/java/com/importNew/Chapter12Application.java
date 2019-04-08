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
public class Chapter12Application {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Chapter12Application.class, args);
		log.info("chapter12 服务启动");
	}

}