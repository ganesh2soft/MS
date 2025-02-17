package com.wipro.articlesprbootapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.wipro.articlesprbootapp.entity.Article;
import com.wipro.articlesprbootapp.repository.ArticleRepository;

@Service
public class ArticleServiceImpl implements ArticleService{

	@Autowired
	private ArticleRepository articleRepository;
	
	
	@Override
	public List<Article> getAllArticles() {
	
		return articleRepository.findAll();
			
	}

	@Override
	public Optional<Article> getArticleById(Long id) {
		
		return articleRepository.findById(id);
	}

	@Override
	public Article saveArticle(Article article) {
		
		return articleRepository.save(article);
	}

	@Override
	public void deleteArticle(Long id) {
		
		 articleRepository.deleteById(id);;
	}

	@Override
	public List<Article> updateArticle(Article article, Long id) {
		
		return null;
	}
	@Override
	public Page<Article> getArticlesByPage(Pageable pagable) {
		
		return articleRepository.findAll(pagable);
	}

	
	
	
	

}
