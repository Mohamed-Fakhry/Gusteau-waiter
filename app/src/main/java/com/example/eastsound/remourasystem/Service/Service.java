package com.example.eastsound.remourasystem.Service;

import com.example.eastsound.remourasystem.model.account.User;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface Service {
    @GET("/restaurant")
    Call<ArrayList<User>> getAccount();

    /*
    @POST("")
    Call<User> login(@Body User user);
    */
}
