package com.yuejiji.bankcard;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
@MapperScan("com.yuejiji.bankcard.mapper")
public class BankCardApplication {

    public static void main(String[] args) {
        SpringApplication.run(BankCardApplication.class, args);
    }

}
