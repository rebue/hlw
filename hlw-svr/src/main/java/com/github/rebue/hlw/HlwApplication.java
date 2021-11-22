package com.github.rebue.hlw;

import org.springframework.boot.SpringApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.SpringCloudApplication;

@SpringCloudApplication
@EnableCaching
public class HlwApplication {

    public static void main(final String[] args) {
        SpringApplication.run(HlwApplication.class, args);
    }

}