package com.example.Newspaper.Publishing.House.API.Controller;

import com.example.Newspaper.Publishing.House.API.Models.Article;
import com.example.Newspaper.Publishing.House.API.RequstObjects.GetArticleRequstObject;
import com.example.Newspaper.Publishing.House.API.ResponseObjects.GetArticleResponse;
import com.example.Newspaper.Publishing.House.API.Service.ArticleService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class ArticleController {
    @Autowired
    ArticleService articleService;
@RequestMapping("article/create")
public void saveArticle(@RequestBody Article article) {
    articleService.saveArticle(article);
}

    @RequestMapping("article/get")
    public List<Article> getArticle() {
        return articleService.getArticle();
    }

    //Path Variable
    @RequestMapping("article/get/{articleId}")
    public GetArticleResponse createArticle (@PathVariable Long articleId) {
        return articleService.getArticleById(articleId);
    }
    public void createArticle(GetArticleRequstObject articleRequestObject) {

        Article article=new Article();
        article.setAuthor(articleRequestObject.getAuthor());
        article.setTitle(articleRequestObject.getTitle());
        article.setPublishDate(articleRequestObject.getPublishDate());

        article.setTitle("Weather Forecast for Next Week");
        article.setContent("The weather will be sunny with occasional rainfal");
        article.setAuthor("Jane Smith");
//        article.setPublishDate((Data) new Date(2023,06,01));
        article.setPublishDate("2023/05/22");





        articleService.saveArticle(article);
    }

}


