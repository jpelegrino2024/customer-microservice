package com.example.customerms;

import com.example.customerms.dto.CustomerInfo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(value = {CustomerInfo.class})
public class CustomerMsApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerMsApplication.class, args);
    }

}
