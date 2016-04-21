package com.example.eastsound.remourasystem;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by EAST SOUND on 15/04/2016.
 */
public class TitleAdapter extends FragmentPagerAdapter {

    private final String[] tabTitles = {"Make Order","Notifications"};
    private final Fragment[] fragments = new Fragment[tabTitles.length];


    public TitleAdapter(FragmentManager fm) {
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
