package com.example.eastsound.remourasystem.model.notification;

import com.google.gson.annotations.SerializedName;

public class Notification {

    @SerializedName("id")
    private int id;
    @SerializedName("table_id")
    private int tableId;
    @SerializedName("desctription")
    private String desctription;

    public Notification(int id,int tableId, String desctription) {
        this.id = id;
        this.tableId = tableId;
        this.desctription = desctription;
    }

    public void setTableId(int tableId) {
        this.tableId = tableId;
    }

    public void setDesctription(String desctription) {
        this.desctription = desctription;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTableId() {
        return tableId;
    }

    public String getDesctription() {
        return desctription;
    }
}
