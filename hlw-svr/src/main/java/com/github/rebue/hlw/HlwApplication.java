package com.github.rebue.hlw;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringCloudApplication
@EnableCaching
public class HlwApplication {

    public static void main(final String[] args) {
        SpringApplication.run(HlwApplication.class, args);
    }

}