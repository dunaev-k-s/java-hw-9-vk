package ru.netology.domain;
//Значки: Лайк,Репост,Просмотры.
public class BadgeInfo {
    private String badgesId;
    private String badgesQuantity;
    private String badgesImage;

    public String getBadgesId() {
        return badgesId;
    }

    public void setBadgesId(String badgesId) {
        this.badgesId = badgesId;
    }

    public String getBadgesQuantity() {
        return badgesQuantity;
    }

    public void setBadgesQuantity(String badgesQuantity) {
        this.badgesQuantity = badgesQuantity;
    }

    public String getBadgesImage() {
        return badgesImage;
    }

    public void setBadgesImage(String badgesImage) {
        this.badgesImage = badgesImage;
    }
}
