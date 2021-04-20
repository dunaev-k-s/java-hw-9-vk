package ru.netology.domain;
//Ссылка на страницу с заголовком и фотографией.
public class Link {
    private String linkId;
    private String linkHeading;
    private String linkImageUrl;
    private String linkUrl;

    public String getLinkId() {
        return linkId;
    }

    public void setLinkId(String linkId) {
        this.linkId = linkId;
    }

    public String getLinkHeading() {
        return linkHeading;
    }

    public void setLinkHeading(String linkHeading) {
        this.linkHeading = linkHeading;
    }

    public String getLinkText() {
        return linkText;
    }

    public void setLinkText(String linkText) {
        this.linkText = linkText;
    }

    public String getLinkImageUrl() {
        return linkImageUrl;
    }

    public void setLinkImageUrl(String linkImageUrl) {
        this.linkImageUrl = linkImageUrl;
    }

    public String getLinkUrl() {
        return linkUrl;
    }

    public void setLinkUrl(String linkUrl) {
        this.linkUrl = linkUrl;
    }
}