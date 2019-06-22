package com.bigdig.viewpagershowcase;

import android.graphics.Color;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class MyViewPagerAdapter extends FragmentStatePagerAdapter {
    public MyViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        int col = Color.WHITE;
        switch (i) {
            case 0:
                col = Color.YELLOW;
                break;
            case 1:
                col = Color.RED;
                break;
            case 2:
                col = Color.GREEN;
        }

        return MyFragment.newInstance(col);
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Page 1";
            case 1:
                return "Page 2";
            case 2:
                return "Page 3";
            default:
                return "Error";
        }
    }
}
