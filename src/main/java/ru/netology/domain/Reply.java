package ru.netology.domain;
//ответ на комментарий
public class Reply {
    private String replyId;
    private String replyName;
    private String replyImageUrl;
    private String replyText;
    private String replyDate;
    private String replyTime;

    public String getReplyId() {
        return replyId;
    }

    public void setReplyId(String replyId) {
        this.replyId = replyId;
    }

    public String getReplyName() {
        return replyName;
    }

    public void setReplyName(String replyName) {
        this.replyName = replyName;
    }

    public String getReplyImageUrl() {
        return replyImageUrl;
    }

    public void setReplyImageUrl(String replyImageUrl) {
        this.replyImageUrl = replyImageUrl;
    }

    public String getReplyText() {
        return replyText;
    }

    public void setReplyText(String replyText) {
        this.replyText = replyText;
    }

    public String getReplyDate() {
        return replyDate;
    }

    public void setReplyDate(String replyDate) {
        this.replyDate = replyDate;
    }

    public String getReplyTime() {
        return replyTime;
    }

    public void setReplyTime(String replyTime) {
        this.replyTime = replyTime;
    }
}
