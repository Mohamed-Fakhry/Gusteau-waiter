package com.example.eastsound.remourasystem.adapter;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.example.eastsound.remourasystem.R;
import com.example.eastsound.remourasystem.model.notification.Notification;
import com.example.eastsound.remourasystem.viewHolder.NotificationViewHolder;
import java.util.ArrayList;

public class NotificationAdapter extends RecyclerView.Adapter<NotificationViewHolder> {

    ArrayList<Notification> notifications;
    Activity activity;

    public NotificationAdapter(ArrayList<Notification> notifications,Activity activity){
        this.notifications = notifications;
        this.activity = activity;
    }

    @Override
    public NotificationViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new NotificationViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_notification,null),activity);
    }

    @Override
    public void onBindViewHolder(NotificationViewHolder holder, int position) {
        holder.setNotification(notifications.get(position));
    }

    @Override
    public int getItemCount() {
        return notifications.size();
    }
}
