package cn.itsource.aigou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy//使用zuul网关
@EnableEurekaClient//使用配置中心客户端
public class ZuulApplication9001 {
    public static void main(String[] args) {
        //可以不需要参数
        SpringApplication.run(ZuulApplication9001.class);
    }
}
