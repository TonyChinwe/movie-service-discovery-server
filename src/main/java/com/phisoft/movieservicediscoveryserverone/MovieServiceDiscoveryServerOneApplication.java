package com.phisoft.movieservicediscoveryserverone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MovieServiceDiscoveryServerOneApplication {

    public static void main(String[] args) {
        SpringApplication.run(MovieServiceDiscoveryServerOneApplication.class, args);
    }

}
