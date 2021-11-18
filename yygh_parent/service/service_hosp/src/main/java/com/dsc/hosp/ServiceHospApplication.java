package com.dsc.hosp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author info
 * 服务启动类
 *
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.dsc.hospital")
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.dsc.hospital")
public class ServiceHospApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceHospApplication.class, args);
    }
}
