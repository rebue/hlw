package rebue.hlw.ctrl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

//这个注解是为了使该包内的过滤器生效。
@ServletComponentScan("rebue.sbs.smx.filter")
@SpringCloudApplication
@EnableFeignClients(basePackages = { "rebue.suc.svr.feign" })
public class HlwApplication {

    public static void main(String[] args) {
        SpringApplication.run(HlwApplication.class, args);
    }

}