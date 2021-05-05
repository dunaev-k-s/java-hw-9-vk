package ru.netology.domain.attachment;

public class VideoRepostInfo {
    private int count;
    private int WallCount;
    private int mailCount;
    private int userReposted;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getWallCount() {
        return WallCount;
    }

    public void setWallCount(int wallCount) {
        WallCount = wallCount;
    }

    public int getMailCount() {
        return mailCount;
    }

    public void setMailCount(int mailCount) {
        this.mailCount = mailCount;
    }

    public int getUserReposted() {
        return userReposted;
    }

    public void setUserReposted(int userReposted) {
        this.userReposted = userReposted;
    }
}
