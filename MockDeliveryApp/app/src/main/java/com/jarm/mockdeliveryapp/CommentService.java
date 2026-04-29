package com.jarm.mockdeliveryapp;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface CommentService {
    @POST("comments")  // Endpoint path
    Call<Comment> createComment(@Body Comment comment);
}