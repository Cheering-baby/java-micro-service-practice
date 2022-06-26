package com.service.consumer.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author daizhihong
 * @create 2022/6/26 14:00
 **/

@Configuration // 注解能被Spring扫描
public class ApplicationContextBean {
    /**
     * 创建RestTemplate对象，将RestTemplate对象的生命周期管理交给Spring
     * @return
     */
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
