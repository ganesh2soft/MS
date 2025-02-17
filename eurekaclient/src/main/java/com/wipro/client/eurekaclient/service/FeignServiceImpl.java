package com.wipro.client.eurekaclient.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.client.eurekaclient.dto.Article;

@Service
public class FeignServiceImpl {
	@Autowired
	ArticleClient articleClient;
	
	public Article searchByArticleId(Long id) {
		System.out.println("service -------------------->" +id);
		Article art = articleClient.getArticleById(id);
		System.out.println("art ***********" + art);
		return art;
	}
	
	
	public List<Article> listAllArticles(){
		return articleClient.getAllArticles();
	}
}
