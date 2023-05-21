package com.example.Newspaper.Publishing.House.API.Controller;

import com.example.Newspaper.Publishing.House.API.Service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArticleController {
    @Autowired
    ArticleService articleService;

}
