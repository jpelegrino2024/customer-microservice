package com.example.customerms.dto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "customer")
@Getter
@Setter
public class CustomerInfo {
    private String environment;
    private String fullname;
    private String email;
}
