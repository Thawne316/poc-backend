package com.gssp.zuulgateway

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient
import org.springframework.cloud.netflix.zuul.EnableZuulProxy

@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
class ZuulGatewayApplication {

	static void main(String[] args) {
		SpringApplication.run(ZuulGatewayApplication, args)
	}

}
