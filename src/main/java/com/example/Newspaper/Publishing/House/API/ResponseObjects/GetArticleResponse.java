package com.example.Newspaper.Publishing.House.API.ResponseObjects;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class GetArticleResponse {
    String title;
    String content;
    String author;
    Data publishDate;

}
