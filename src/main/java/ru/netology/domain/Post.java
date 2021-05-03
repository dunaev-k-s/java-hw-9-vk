package ru.netology.domain;

public class Post {
    private int postId;
    private Link link;
    private Video video;
    private Article article;
    private CommentsInfo commentsInfo;
    private BadgeInfo badge;
    private String postText;
    private String postTime;
    private String postDate;
    private String postName;
    private String postNameUrl;
    private String postNameImageUrl;

    public String getPostTime() {
        return postTime;
    }

    public void setPostTime(String postTime) {
        this.postTime = postTime;
    }

    public String getPostDate() {
        return postDate;
    }

    public void setPostDate(String postDate) {
        this.postDate = postDate;
    }

    public String getPostName() {
        return postName;
    }

    public void setPostName(String postName) {
        this.postName = postName;
    }

    public String getPostNameUrl() {
        return postNameUrl;
    }

    public void setPostNameUrl(String postNameUrl) {
        this.postNameUrl = postNameUrl;
    }

    public String getPostNameImageUrl() {
        return postNameImageUrl;
    }

    public void setPostNameImageUrl(String postNameImageUrl) {
        this.postNameImageUrl = postNameImageUrl;
    }

    public String getPostText() {
        return postText;
    }

    public void setPostText(String postText) {
        this.postText = postText;
    }

}
