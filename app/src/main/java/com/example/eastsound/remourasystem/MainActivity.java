package com.example.eastsound.remourasystem;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {
//    View[] section = new View[3] ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void logIn(View view){
        Intent logINIntent = new Intent(this,MainPager.class);
        startActivity(logINIntent);
    }
}
