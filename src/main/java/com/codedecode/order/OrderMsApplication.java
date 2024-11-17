package com.codedecode.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class OrderMsApplication {

	public static void main(String[] args) {
		//mongodb+srv://admin:LathaJosh@atlas-cluster.br0am.mongodb.net/
		//mongodb+srv://admin:codedecode@atlas-cluster.mqdj7js.mongodb.net/?retryWrites=true&w=majority # mongodb://localhost:27017/orderdb
		SpringApplication.run(OrderMsApplication.class, args);

	}

	@Bean
	@LoadBalanced
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

}
