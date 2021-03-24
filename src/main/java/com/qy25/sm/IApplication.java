package com.qy25.sm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan(basePackages = "com.qy25.sm.mapper")
@EnableTransactionManagement
public class IApplication {
    public static void main(String[] args) {
        SpringApplication.run(IApplication.class);
    }
}
