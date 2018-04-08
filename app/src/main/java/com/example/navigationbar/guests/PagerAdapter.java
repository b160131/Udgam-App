package com.example.navigationbar.guests;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


public class PagerAdapter extends FragmentPagerAdapter {

    public PagerAdapter(FragmentManager fm){
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:return new frag1();
            case 1:return new frag2();
            default:break;
        }
        return null;
    }

    @Override
    public int getCount() {
        return 2;
    }
}

