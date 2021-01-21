<<<<<<< HEAD
package com.dev.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

@Configuration
@EnableSwagger2
/**
 * Swagger配置
 * @author 路飞
 * @create 2021/1/5
 */
public class SwaggerConfig {
    /**
     * 是否启用swagger文档
     */
    @Value("${swagger.enable}")
    private boolean enable;

    @Bean
    public Docket docket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .enable(enable)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.withClassAnnotation(RestController.class))
                .build();
    }

    //配置swagger 信息 = apiInfo
    private ApiInfo apiInfo() {
        //作者信息
        Contact contact = new Contact("接口文档", "https://github.com/luffy997", "389783961@qq.com");

        return new ApiInfo("接口文档",
                "接口文档",
                "v1.0",
                "www.baidu.com", contact,
                "Appache2.0",
                "http://www.appache.org/licenses/LICENSE-2.0",
                new ArrayList<>());
    }
}
=======
package com.dev.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

@Configuration
@EnableSwagger2
/**
 * Swagger配置
 * @author 路飞
 * @create 2021/1/5
 */
public class SwaggerConfig {
    /**
     * 是否启用swagger文档
     */
    @Value("${swagger.enable}")
    private boolean enable;

    @Bean
    public Docket docket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .enable(enable)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.withClassAnnotation(RestController.class))
                .build();
    }

    //配置swagger 信息 = apiInfo
    private ApiInfo apiInfo() {
        //作者信息
        Contact contact = new Contact("接口文档", "https://github.com/luffy997", "389783961@qq.com");

        return new ApiInfo("接口文档",
                "接口文档",
                "v1.0",
                "www.baidu.com", contact,
                "Appache2.0",
                "http://www.appache.org/licenses/LICENSE-2.0",
                new ArrayList<>());
    }
}
>>>>>>> a587113e1e2ddd393f1aca9f62ae9e128b6c953e
