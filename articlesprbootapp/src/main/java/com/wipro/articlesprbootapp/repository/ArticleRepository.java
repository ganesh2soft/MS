package com.wipro.articlesprbootapp.repository;

import java.util.Optional;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.wipro.articlesprbootapp.entity.Article;

@Repository
public interface ArticleRepository  extends JpaRepository<Article, Long>, PagingAndSortingRepository<Article, Long>{

//	Optional<Article> findById(Pageable pagable);

}
