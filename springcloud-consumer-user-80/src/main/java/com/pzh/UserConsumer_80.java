package com.pzh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * Time: 2020/7/16
 *
 * @author PZH
 */
@SpringBootApplication
@EnableEurekaClient
public class UserConsumer_80 {
    public static void main(String[] args) {
        SpringApplication.run(UserConsumer_80.class,args);
    }

}
