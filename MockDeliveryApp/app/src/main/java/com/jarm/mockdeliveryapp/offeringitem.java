package com.jarm.mockdeliveryapp;

public class offeringitem {
    String offeringid;
    String restaurantname;
    String offeringname;
    String offeringshortlocation;
    String offeringlonglocation;
    String offeringpublicationdate;

    String offeringpictureurl;
    double offeringprice;
    offeringitem(String a,String b,String c,String d,String e,String f,String g,double h) {
        this.offeringid = a;
        this.restaurantname = b;
        this.offeringname = c;
        this.offeringshortlocation = d;
        this.offeringlonglocation = e;
        this.offeringpublicationdate = f;
        this.offeringpictureurl = g;
        this.offeringprice = h;
    }
    String getofferingid() {
        return this.offeringid;
    }
    String getrestaurantname() {
        return this.restaurantname;
    }
    String getofferingname() {
        return this.offeringname;
    }
    String getofferingshortlocation() {
        return this.offeringshortlocation;
    }
    String getofferinglonglocation() {
        return this.offeringlonglocation;
    }
    String getofferingpublicationdate() {
        return this.offeringpublicationdate;
    }
    String getofferingpictureurl() {
        return this.offeringpictureurl;
    }
    double getofferingprice() {
        return this.offeringprice;
    }
}
