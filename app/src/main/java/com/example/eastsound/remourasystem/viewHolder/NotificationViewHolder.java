package com.example.eastsound.remourasystem.viewHolder;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.eastsound.remourasystem.R;
import com.example.eastsound.remourasystem.model.notification.Notification;
import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * Created by EAST SOUND on 25/04/2016.
 */
public class NotificationViewHolder extends RecyclerView.ViewHolder{

    @Bind(R.id.notificationImage)
    ImageView notificationImage;
    @Bind(R.id.desctription)
    TextView desctription;
    @Bind(R.id.tableId)
    TextView tableId;

    Activity activity;

    public NotificationViewHolder(View itemView, Activity activity) {
        super(itemView);
        this.activity = activity;
        ButterKnife.bind(this,itemView);
    }

    public void setNotification(Notification notification){

        if(notification.getDesctription().equals("Kitchen Call")){
            Glide.with(activity)
                    .load(R.drawable.ckp)
                    .asBitmap()
                    .into(notificationImage);
        } else {
            Glide.with(activity)
                    .load(R.drawable.person)
                    .asBitmap()
                    .into(notificationImage);
        }

        desctription.setText(notification.getDesctription());

        tableId.setText(String.valueOf(notification.getTableId()));

    }
}
