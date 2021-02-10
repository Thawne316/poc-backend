package com.gssp.worklogdisplay

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.context.config.annotation.RefreshScope
import org.springframework.cloud.netflix.eureka.EnableEurekaClient
import org.springframework.cloud.openfeign.EnableFeignClients

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@RefreshScope
class WorklogDisplayApplication {

	static void main(String[] args) {
		SpringApplication.run(WorklogDisplayApplication, args)
	}

}
