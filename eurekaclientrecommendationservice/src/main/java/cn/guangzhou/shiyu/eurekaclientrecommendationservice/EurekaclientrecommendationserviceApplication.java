package cn.guangzhou.shiyu.eurekaclientrecommendationservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
//@ComponentScan(excludeFilters = {@ComponentScan.Filter(type= FilterType.ANNOTATION,value = ExcludeFromComponetScan.class)})
@RibbonClient(name="say-Hello",configuration = SayHelloConfiguration.class)
public class EurekaclientrecommendationserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaclientrecommendationserviceApplication.class, args);

	}

	@LoadBalanced
	@Bean
	RestTemplate restTemplate(){
		return new RestTemplate();
	}

}
