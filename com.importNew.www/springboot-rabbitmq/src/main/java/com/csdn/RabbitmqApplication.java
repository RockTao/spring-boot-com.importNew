package com.csdn;
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
public class RabbitmqApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(RabbitmqApplication.class, args);
		log.info("RabbitmqApplication 服务启动");
	}

}