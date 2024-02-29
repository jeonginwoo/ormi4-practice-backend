package com.example.blog.dto;

import com.example.blog.domain.Article;
import lombok.Getter;

@Getter
public class ArticleResponse {
    private String title;
    private String content;

    public ArticleResponse(Article article) {
        this.title = article.getTitle();
        this.content = article.getContent();
    }
}