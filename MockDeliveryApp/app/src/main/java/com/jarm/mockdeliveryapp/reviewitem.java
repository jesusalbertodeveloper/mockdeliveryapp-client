package com.jarm.mockdeliveryapp;

public class reviewitem {
    String reviewid;
    String reviewername;
    int starcount;
    String reviewdate;
    String reviewtext;
    public reviewitem(String reviewid1,String reviewername1, int starcount1,String reviewdate1,String reviewtext1) {
        this.reviewid = reviewid1;
        this.reviewername = reviewername1;
        this.starcount = starcount1;
        this.reviewdate = reviewdate1;
        this.reviewtext = reviewtext1;
    }
    String getreviewid() {
        return this.reviewid;
    }
    String getreviewername() {
        return this.reviewername;
    }
    int getstarcount() {
        return this.starcount;
    }
    String getreviewdate() {
        return this.reviewdate;
    }
    String getreviewtext() {
        return this.reviewtext;
    }
}
