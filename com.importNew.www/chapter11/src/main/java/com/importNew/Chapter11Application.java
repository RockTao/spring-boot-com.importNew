package com.importNew;
import org.mybatis.spring.annotation.MapperScan;
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
@Slf4j
//@MapperScan("com.importNew.*.dao")
public class Chapter11Application {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Chapter11Application.class, args);
		log.info("chapter11 服务启动");
	}

}