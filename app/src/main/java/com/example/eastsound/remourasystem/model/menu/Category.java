package com.example.eastsound.remourasystem.model.menu;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Category {

    @SerializedName("id")
    private int id;
    @SerializedName("name")
    private String nameArbic;
    private String nameEnglish;
    private String imageURL;
    @SerializedName("items")
    private ArrayList<MenuItem> categoryItems;



    public Category(int id, String nameArbic,String imageURL,ArrayList<MenuItem> categoryItems) {
        this.id = id;
        this.nameArbic = nameArbic;
        this.imageURL = imageURL;
        this.categoryItems = categoryItems;
    }

    public Category(int id, String nameArbic, String nameEnglish, String imageURL, ArrayList<MenuItem> categoryItems) {
        this.id = id;
        this.nameArbic = nameArbic;
        this.nameEnglish = nameEnglish;
        this.imageURL = imageURL;
        this.categoryItems = categoryItems;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameArbic() {
        return nameArbic;
    }

    public void setNameArbic(String nameArbic) {
        this.nameArbic = nameArbic;
    }

    public ArrayList<MenuItem> getCategoryItems() {
        return categoryItems;
    }

    public void setCategoryItems(ArrayList<MenuItem> categoryItems) {
        this.categoryItems = categoryItems;
    }

    public String getNameEnglish() {
        return nameEnglish;
    }

    public void setNameEnglish(String nameEnglish) {
        this.nameEnglish = nameEnglish;
    }
}
