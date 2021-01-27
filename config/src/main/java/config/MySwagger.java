package config;

import io.swagger.annotations.Api;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.env.Profiles;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

/**
 * Time: 2020/4/18
 * Swagger配置
 * @author PZH
 */
@Configuration
@EnableSwagger2             //开启Swagger
public class MySwagger {

    //配置Swagger的Docket的Bean实例
    @Bean
    public Docket docket(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .groupName("pangzhihui")
                .select()
                .apis(RequestHandlerSelectors.withClassAnnotation(Api.class))
                //.apis(RequestHandlerSelectors.basePackage("com.pzh.controller"))
                .build();
    }
    //配置Swagger信息=apiInfo
    private ApiInfo apiInfo(){
        //作者信息
        Contact contact = new Contact("pzh", "https://mp.csdn.net/console/article", "2466331258@qq.com");
        return new ApiInfo("Swagger API文档",
                "学海无涯",
                "v1.0",
                "https://mp.csdn.net/console/article",
                contact,
                "我的博客地址",
                "https://mp.csdn.net/console",
                new ArrayList());
    }
}
