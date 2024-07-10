package com.wipro.articlesprbootapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ArticlesprbootappApplication {

	public static void main(String[] args) {
		SpringApplication.run(ArticlesprbootappApplication.class, args);
	}

}
