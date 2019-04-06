package cn.guangzhou.shiyu.eurekaclientservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaclientserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaclientserviceApplication.class, args);
	}

}
