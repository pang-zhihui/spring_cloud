package com.pzh;

import config.MySwagger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * Time: 2020/7/15
 *
 * @author PZH
 */
@SpringBootApplication
@EnableEurekaClient      //在服务启动后自动注册到Eureka中
public class UserProvider_8001 {
    public static void main(String[] args) {
        SpringApplication.run(UserProvider_8001.class,args);
    }
}
