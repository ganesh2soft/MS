package com.wipro.articlesprbootapp.service;


import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.wipro.articlesprbootapp.entity.Article;


public interface ArticleService {
	public List<Article> getAllArticles();
	public Optional<Article>  getArticleById(Long id);
	public Article saveArticle(Article article);
	public void deleteArticle(Long id);
	public List<Article> updateArticle(Article article, Long id);
	public Page<Article> getArticlesByPage(Pageable pagable);
}
