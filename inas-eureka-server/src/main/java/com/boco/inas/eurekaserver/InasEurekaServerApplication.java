package com.boco.inas.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class InasEurekaServerApplication {

    /**
     * 服务端启动入口
     *
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(InasEurekaServerApplication.class, args);
    }
}