package com.wipro.client.eurekaclient.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.wipro.client.eurekaclient.dto.Article;

@FeignClient(name="ARTICLESPRBOOTAPP")
public interface ArticleClient {
	@GetMapping("/api/v1/articles/all")
	public List<Article> getAllArticles();
	
	@GetMapping("/api/v1/articles/getartbyid/{id}")
	public Article  getArticleById(Long id);

}
