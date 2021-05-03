package ru.netology.domain;
//блок ответов под комментарием
public class ReplyInfo {
    private int ReplyInfoId;
    private String lastName;
    private String lastNameImageUrl;
    private String quantityReplies;
    private Reply reply;

    public int getReplyInfoId() {
        return ReplyInfoId;
    }

    public void setReplyInfoId(int replyInfoId) {
        ReplyInfoId = replyInfoId;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastNameImageUrl() {
        return lastNameImageUrl;
    }

    public void setLastNameImageUrl(String lastNameImageUrl) {
        this.lastNameImageUrl = lastNameImageUrl;
    }

    public String getQuantityReplies() {
        return quantityReplies;
    }

    public void setQuantityReplies(String quantityReplies) {
        this.quantityReplies = quantityReplies;
    }
}
