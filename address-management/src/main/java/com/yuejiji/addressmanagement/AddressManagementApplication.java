package com.yuejiji.addressmanagement;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author zhangshunmin
 */
@SpringBootApplication
@MapperScan("com.yuejiji.addressmanagement.mapper")
@EnableDiscoveryClient
@EnableFeignClients
public class AddressManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(AddressManagementApplication.class, args);
    }

}
