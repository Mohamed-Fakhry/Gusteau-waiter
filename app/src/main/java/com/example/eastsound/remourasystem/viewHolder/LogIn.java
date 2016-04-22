package com.example.eastsound.remourasystem.viewHolder;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import com.example.eastsound.remourasystem.R;

import butterknife.Bind;
import butterknife.ButterKnife;

public class LogIn extends AppCompatActivity {
    @Bind(R.id.userName)
    EditText userName;

    @Bind(R.id.password)
    EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    public void logIn(View view){

        Intent logINIntent = new Intent(this,MainPager.class);
        startActivity(logINIntent);
    }
}
