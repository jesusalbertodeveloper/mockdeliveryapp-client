package com.jarm.mockdeliveryapp;

public class toppingitem {
    String itemname;
    String pictureurl;
    String toppingid;
    double itemcost;
    public toppingitem(String itemnamee,String pictureurll,String toppingidd,double pricee) {
        this.itemname = itemnamee;
        this.pictureurl = pictureurll;
        this.toppingid = toppingidd;
        this.itemcost = pricee;
    }
    String getitemname() {
        return this.itemname;
    }
    String gettoppingid() {
        return this.toppingid;
    }
    String getpictureurl() {
        return this.pictureurl;
    }
    //String getbusinessname() {
      //  return this.businessname;
    //}
    //String getofferdescription() {
        //return this.offerdescription;
    //}
    double getitemcost() {
        return this.itemcost;
    }
}
