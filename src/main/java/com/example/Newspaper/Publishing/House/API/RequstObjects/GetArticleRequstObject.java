package com.example.Newspaper.Publishing.House.API.RequstObjects;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class GetArticleRequstObject {
    String title;
    String author;
    Data publishDate;

}
