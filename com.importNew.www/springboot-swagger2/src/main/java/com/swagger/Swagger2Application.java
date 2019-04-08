package com.swagger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Swagger2集成及使用
 * @author xiedeshou
 *
 */
@SpringBootApplication
@EnableSwagger2
@Slf4j
public class Swagger2Application {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Swagger2Application.class, args);
		log.info("  Swagger2是-------服务启动");
	}

}