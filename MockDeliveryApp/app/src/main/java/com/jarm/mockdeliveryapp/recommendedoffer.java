package com.jarm.mockdeliveryapp;

public class recommendedoffer {
    String businessname;
    String businessid;
    String offerid;
    String pictureurl;
    String offerdescription;
    double price;
    public recommendedoffer(String businessnamee,String businessidd,String offeridd,String pictureurll,String offerdescriptionn,double pricee) {
        this.businessname = businessnamee;
        this.businessid = businessidd;
        this.offerid = offeridd;
        this.pictureurl = pictureurll;
        this.offerdescription = offerdescriptionn;
        this.price = pricee;
    }
    String getbusinessname() {
        return this.businessname;
    }
    String getbusinessid() {
        return this.businessid;
    }
    String getofferid() {
        return this.offerid;
    }
    String getpictureurl() {
        return this.pictureurl;
    }
    //String getbusinessname() {
      //  return this.businessname;
    //}
    String getofferdescription() {
        return this.offerdescription;
    }
    double getprice() {
        return this.price;
    }
}
