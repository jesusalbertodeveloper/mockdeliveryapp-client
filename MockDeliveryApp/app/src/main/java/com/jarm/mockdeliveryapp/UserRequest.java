package com.jarm.mockdeliveryapp;

public class UserRequest {
    private String name;
    private String surname;
    private String address;
    private String addressComments;
    private String emailAddress;
    private String phoneNumber;
    private String password;

    public UserRequest(String namee,String surnamee,String addresss,String addresscommentss,String emailaddresss,String phonenumberr,String passwordd) {
        this.name = namee;
        this.surname = surnamee;
        this.address = addresss;
        this.addressComments = addresscommentss;
        this.emailAddress = emailaddresss;
        this.phoneNumber = phonenumberr;
        this.password = passwordd;
    }
}
