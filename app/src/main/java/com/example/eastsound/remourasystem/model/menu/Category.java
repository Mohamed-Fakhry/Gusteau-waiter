package com.example.eastsound.remourasystem.model.menu;

import java.util.ArrayList;

public class Category {
    private int id;
    private String name;
    private ArrayList<MenuItem> categoryItems;

    public Category(int id, String name, ArrayList<MenuItem> categoryItems) {
        this.id = id;
        this.name = name;
        this.categoryItems = categoryItems;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<MenuItem> getCategoryItems() {
        return categoryItems;
    }

    public void setCategoryItems(ArrayList<MenuItem> categoryItems) {
        this.categoryItems = categoryItems;
    }

}
