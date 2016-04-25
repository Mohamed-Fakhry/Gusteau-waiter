package com.example.eastsound.remourasystem.Service;

import com.example.eastsound.remourasystem.model.account.User;
import com.example.eastsound.remourasystem.model.menu.Category;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Service {
    @GET("/restaurant")
    Call<ArrayList<User>> getAccount();

    @GET("/categories")
    Call<Responed> getcategories();
}
