package com.pzh.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Time: 2020/7/16
 *
 * @author PZH
 */
@SpringBootApplication
@EnableEurekaServer     //表示是一个服务端的启动类，可以接受别人注册进来
public class EurekaServer_7001 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer_7001.class,args);
    }
}
