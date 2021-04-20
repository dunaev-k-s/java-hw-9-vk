package ru.netology.domain;

public class Video {
    private String videoId;
    private String videoImageUrl;
    private String videoUrl;
    private String videoHeading;
    private String videoViews;

    public String getVideoId() {
        return videoId;
    }

    public void setVideoId(String videoId) {
        this.videoId = videoId;
    }

    public String getVideoImageUrl() {
        return videoImageUrl;
    }

    public void setVideoImageUrl(String videoImageUrl) {
        this.videoImageUrl = videoImageUrl;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public String getVideoHeading() {
        return videoHeading;
    }

    public void setVideoHeading(String videoHeading) {
        this.videoHeading = videoHeading;
    }

    public String getVideoViews() {
        return videoViews;
    }

    public void setVideoViews(String videoViews) {
        this.videoViews = videoViews;
    }
}
