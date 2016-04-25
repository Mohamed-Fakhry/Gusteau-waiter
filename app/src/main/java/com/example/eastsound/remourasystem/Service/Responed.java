package com.example.eastsound.remourasystem.Service;

import com.example.eastsound.remourasystem.model.menu.Category;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by EAST SOUND on 25/04/2016.
 */
public class Responed {
    @SerializedName("categories")
    ArrayList<Category> categoryArrayList;

    public ArrayList<Category> getCategoryArrayList() {
        return categoryArrayList;
    }
}
