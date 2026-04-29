package com.jarm.mockdeliveryapp;

import okhttp3.OkHttpClient;
//import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class apiservicee {
    private static Retrofit retrofit = null;

    public static Retrofit getClient(String baseUrl) {
        //HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        //logging.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient client = new OkHttpClient.Builder()
          //      .addInterceptor(logging)
                .build();

        retrofit = new Retrofit.Builder()
                .baseUrl(baseUrl)  // e.g., "http://10.0.2.2:5000/"
                .client(client)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return retrofit;
    }
}