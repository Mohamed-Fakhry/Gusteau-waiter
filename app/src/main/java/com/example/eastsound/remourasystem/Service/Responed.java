package com.example.eastsound.remourasystem.Service;

import com.example.eastsound.remourasystem.model.menu.Category;
import com.example.eastsound.remourasystem.model.notification.Notification;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Responed {
    @SerializedName("categories")
    ArrayList<Category> categoryArrayList;

    @SerializedName("notifications")
    ArrayList<Notification> notificationArrayList;

    public ArrayList<Category> getCategoryArrayList() {
        return categoryArrayList;
    }
    public ArrayList<Notification> getNotificationArrayList(){ return notificationArrayList; }
}
