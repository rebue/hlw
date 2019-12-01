package com.github.rebue.hlw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

// 这个注解是为了使该包内的过滤器生效。
@ServletComponentScan("rebue.sbs.smx.filter")
@SpringCloudApplication
@Slf4j
@RestController
public class HlwApplication {
    @RequestMapping("/")
    public String home() {
        log.info("Handling home");
        return "Hello World";
    }

    public static void main(final String[] args) {
        SpringApplication.run(HlwApplication.class, args);
    }

}