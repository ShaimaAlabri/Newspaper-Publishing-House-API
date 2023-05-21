package com.example.Newspaper.Publishing.House.API.ResponseObjects;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class GetArticleResponse {
    String title;
    String author;

}
