package com.example.eastsound.remourasystem.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.eastsound.remourasystem.viewHolder.BlankFragmentB;
import com.example.eastsound.remourasystem.viewHolder.MakeOrder;

/**
 * Created by EAST SOUND on 15/04/2016.
 */
public class TabAdapter extends FragmentPagerAdapter {

    private final String[] tabTitles = {"Make Order","Notifications"};
    private final Fragment[] fragments = new Fragment[tabTitles.length];


    public TabAdapter(FragmentManager fm) {
        super(fm);
        fragments[0] = new MakeOrder();
        fragments[1] = new BlankFragmentB();
    }


    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }

    @Override
    public Fragment getItem(int position) {
        return fragments[position];
    }

    @Override
    public int getCount() {
        return fragments.length;
    }
}