package com.jarm.mockdeliveryapp;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface AccountCreationSessionAPIService {
    @POST("signup")
    Call<AccountCreationSessionAPIResponse> signup(@Body UserRequest request);
    @POST("verifyEmail")
    Call<AccountCreationSessionAPIVerificationResponse> verifyEmail(@Body VerificationRequest request);
    @POST("verifyPhone")
    Call<AccountCreationSessionAPIVerificationResponse> verifyPhone(@Body VerificationRequest request);
}
