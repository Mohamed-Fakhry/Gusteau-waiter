package com.example.eastsound.remourasystem;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;

import com.example.eastsound.remourasystem.adapter.TabAdapter;
import com.example.eastsound.remourasystem.R;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainPager extends FragmentActivity {
    @Bind(R.id.container)
    ViewPager viewPager;

    @Bind(R.id.tabs)
    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        ButterKnife.bind(this);

        initViewPager();
    }

    private void initViewPager() {
        TabAdapter tabAdapter = new TabAdapter(getSupportFragmentManager());

        viewPager.setAdapter(tabAdapter);
        viewPager.setCurrentItem(0);

        tabLayout.setupWithViewPager(viewPager);
    }
}
