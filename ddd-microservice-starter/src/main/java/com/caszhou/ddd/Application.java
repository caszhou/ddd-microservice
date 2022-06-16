package com.caszhou.ddd;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author caszhou
 * @date 2022/6/16
 */
@SpringBootApplication(scanBasePackages = {"com.caszhou.ddd", "com.alibaba.cola"})
@MapperScan("com.caszhou.ddd.repository")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
