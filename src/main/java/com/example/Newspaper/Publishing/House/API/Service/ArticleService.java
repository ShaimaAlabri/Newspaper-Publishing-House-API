package com.example.Newspaper.Publishing.House.API.Service;

import com.example.Newspaper.Publishing.House.API.Models.Article;
import com.example.Newspaper.Publishing.House.API.Repository.ArticleRepository;
import com.example.Newspaper.Publishing.House.API.ResponseObjects.GetArticleResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArticleService {
    @Autowired
    ArticleRepository articleRepository;

    public void saveArticle(Article article) {
        articleRepository.save(article);
    }

    public List<Article> getArticle() {
        return articleRepository.findAll();
    }

    public GetArticleResponse getArticleById(Long articleId) {
        Optional<Article> optionalArticle =  articleRepository.findById(articleId);
        if(!optionalArticle.isEmpty())
        {
            Article article1 = optionalArticle.get();


            GetArticleResponse getArticleResponse = new GetArticleResponse(article1.getTitle(),article1.getContent(),article1.getAuthor(),article1.getPublishDate());
            return articleRepository;
        }

        return null;

    }

}
