package com.service.consumer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author daizhihong
 * @create 2022/6/18 21:56
 **/

/**
 * RestTemplate工具类，主要用来提供TestTemplate对象
 */

@Configuration // 注解能被Spring扫描
public class ApplicationContextConfig {
    /**
     * 创建RestTemplate对象，将RestTemplate对象的生命周期管理交给Spring
     * @return
     */
    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
