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
            Article article = optionalArticle.get();


            GetArticleResponse articleResponse = new GetArticleResponse(article.getTitle(), article.getContent(), article.getAuthor(),article.getPublishDate());
            return articleResponse;

        }

        return null;

    }

    public void deleteArticleById(Long id) {
        articleRepository.deleteById(id);
    }

    public void saveOrUpdate(Article article) {
        articleRepository.save(article);
    }
    public Article updateArticle(Long id, Article updateData){
        Article article = articleRepository.findById(id).orElse(null);
        if (article != null) {
            article.setAuthor(updateData.getAuthor());
            article.setContent(updateData.getContent());
            article.setTitle(updateData.getTitle());
            article.setPublishDate(updateData.getPublishDate());


            return articleRepository.save(article);
        }
        return null;
    }

}
