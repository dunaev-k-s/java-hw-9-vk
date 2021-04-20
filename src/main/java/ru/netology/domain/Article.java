package ru.netology.domain;
//Статьи
public class Article {
    private String articleId;
    private String articleHeading;
    private String articleSecondHeading;
    private String articleUrl;
    private String articleImageUrl;

    public String getArticleId() {
        return articleId;
    }

    public void setArticleId(String articleId) {
        this.articleId = articleId;
    }

    public String getArticleHeading() {
        return articleHeading;
    }

    public void setArticleHeading(String articleHeading) {
        this.articleHeading = articleHeading;
    }

    public String getArticleSecondHeading() {
        return articleSecondHeading;
    }

    public void setArticleSecondHeading(String articleSecondHeading) {
        this.articleSecondHeading = articleSecondHeading;
    }

    public String getArticleUrl() {
        return articleUrl;
    }

    public void setArticleUrl(String articleUrl) {
        this.articleUrl = articleUrl;
    }

    public String getArticleImageUrl() {
        return articleImageUrl;
    }

    public void setArticleImageUrl(String articleImageUrl) {
        this.articleImageUrl = articleImageUrl;
    }
}
