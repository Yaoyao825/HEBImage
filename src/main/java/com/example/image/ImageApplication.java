package com.example.image;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author lydia.zhang
 * @date 2023/3/26 14:28
 */
@SpringBootApplication
@MapperScan("com.example.image.dao")
public class ImageApplication {
    public static void main(String[] args) {
        SpringApplication.run(ImageApplication.class, args);
    }

}
