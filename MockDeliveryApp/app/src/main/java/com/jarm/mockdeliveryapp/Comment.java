package com.jarm.mockdeliveryapp;

import com.google.gson.annotations.SerializedName;

public class Comment {
    @SerializedName("title")
    private String title;

    @SerializedName("body")
    private String body;

    @SerializedName("author")
    private String author;

    public Comment(String title, String body, String author) {
        this.title = title;
        this.body = body;
        this.author = author;
    }
    // Getters and setters...
}
