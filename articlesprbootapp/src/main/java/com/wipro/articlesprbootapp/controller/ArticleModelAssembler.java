package com.wipro.articlesprbootapp.controller;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;
import org.springframework.stereotype.Component;

import com.wipro.articlesprbootapp.entity.Article;

@Component
public class ArticleModelAssembler implements RepresentationModelAssembler<Article, EntityModel<Article>>{

	@Override
    public EntityModel<Article> toModel(Article article) {
        return EntityModel.of(article,
                linkTo(methodOn(ArticleController.class).getArticleById(article.getId())).withSelfRel(),
                linkTo(methodOn(ArticleController.class).getAllArticles()).withRel("articles"));
    }

}
