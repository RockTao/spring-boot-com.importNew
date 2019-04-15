package com.importNew;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

/**
 * mybaits集成
 * @author oKong
 *
 */
@SpringBootApplication
@Slf4j
public class Chapter36Application {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Chapter36Application.class, args);
		log.info("---------------36 --------------------- 启动!");
	}
}
