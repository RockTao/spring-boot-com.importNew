package com.importNew;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.config.EnableMongoAuditing;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@EnableMongoAuditing
//@EnableMongoRepositories(basePackages="cn.lqdev")//当有些dao不在default page下时 可通过此方法进行注册扫描包
@Slf4j
public class MongodbApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(MongodbApplication.class, args);
        log.info("spring-boot-mongodb-chapter31启动!");
    }
}
