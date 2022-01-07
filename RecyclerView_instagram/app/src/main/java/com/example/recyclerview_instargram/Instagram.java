package com.example.recyclerview_instargram;

public class Instagram {

    int image;
    int image2;
    int image3;
    int image4;
    int image5;
    String username;
    String likecount;
    String hashtag;

    public Instagram(int img, int img2, int img3, int img4, int img5, String name, String like, String tag){
        this.image = img;
        this.image2 = img2;
        this.image3 = img3;
        this.image4 = img4;
        this.image5 = img5;
        this.username = name;
        this.likecount = like;
        this.hashtag =tag;
    }

    public int getImage() {
        return image;
    }

    public int getImage2() {
        return image2;
    }

    public int getImage3() {
        return image3;
    }

    public int getImage4() {
        return image4;
    }

    public int getImage5() {
        return image5;
    }

    public String getUsername() {
        return username;
    }

    public String getLikecount() {
        return likecount;
    }

    public String getHashtag() {
        return hashtag;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public void setImage2(int image2) {
        this.image2 = image2;
    }

    public void setImage3(int image3) {
        this.image3 = image3;
    }

    public void setImage4(int image4) {
        this.image4 = image4;
    }

    public void setImage5(int image5) {
        this.image5 = image5;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setLikecount(String likecount) {
        this.likecount = likecount;
    }

    public void setHashtag(String hashtag) {
        this.hashtag = hashtag;
    }
}
