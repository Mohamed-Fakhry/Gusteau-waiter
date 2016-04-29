package com.example.eastsound.remourasystem;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.bumptech.glide.Glide;
import com.example.eastsound.remourasystem.Service.Responed;
import com.example.eastsound.remourasystem.Service.SetupService;
import com.example.eastsound.remourasystem.adapter.NotificationAdapter;
import com.example.eastsound.remourasystem.model.notification.Notification;

import java.util.ArrayList;

import butterknife.Bind;
import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class NotificationFragment extends Fragment {

    @Bind(R.id.notificationRV)
    RecyclerView noificationRV;
    @Bind(R.id.background)
    ImageView background;

    ArrayList<Notification> notifications;

    public static NotificationFragment newNotification(Bundle bundle){
        NotificationFragment newStanceNotification = new NotificationFragment();
        newStanceNotification.setArguments(bundle);
        return newStanceNotification;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.notifications_layout, container, false);
        ButterKnife.bind(this,view);
        Glide.with(this)
                .load(R.drawable.background)
                .asBitmap()
                .into(background);
        return view;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        getNotifications(getActivity());
    }

    @Override
    public void onResume() {
        super.onResume();
        getNotifications(getActivity());
    }

    public void getNotifications(final Activity activity){
        SetupService.getservice.getNotification().enqueue(new Callback<Responed>() {
            @Override
            public void onResponse(Call<Responed> call, Response<Responed> response) {
                notifications = response.body().getNotificationArrayList();

                NotificationAdapter adapter = new NotificationAdapter(notifications,activity);
                noificationRV.setLayoutManager(new LinearLayoutManager(activity, LinearLayout.VERTICAL,false));
                noificationRV.setAdapter(adapter);
                Log.d("Test","Seccess");

            }
            @Override
            public void onFailure(Call<Responed> call, Throwable t) {
                Log.d("Test","Fail");
            }
        });
    }

}
