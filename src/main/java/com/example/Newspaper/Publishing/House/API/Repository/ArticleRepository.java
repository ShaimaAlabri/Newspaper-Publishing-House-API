package com.example.Newspaper.Publishing.House.API.Repository;

import com.example.Newspaper.Publishing.House.API.Models.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleRepository extends JpaRepository<Article,Long> {
}
