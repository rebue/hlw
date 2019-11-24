package com.github.rebue.hlw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.client.SpringCloudApplication;

// 这个注解是为了使该包内的过滤器生效。
@ServletComponentScan("rebue.sbs.smx.filter")
@SpringCloudApplication
public class HlwApplication {
    public static void main(final String[] args) {
        SpringApplication.run(HlwApplication.class, args);
    }

}