package com.importNew;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import lombok.extern.slf4j.Slf4j;


/**
 * Swagger2集成及使用
 * @author xiedeshou
 *
 */
@SpringBootApplication
@EnableAspectJAutoProxy
@Slf4j
public class Chapter26Application {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Chapter26Application.class, args);
		log.info("chapter26--- 服务启动");
	}

}