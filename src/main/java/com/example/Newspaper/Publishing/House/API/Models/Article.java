package com.example.Newspaper.Publishing.House.API.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Data
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;
    String title;
    String content;
    String author;
    @Column(name = "publish_date")
    String publishDate;


}
