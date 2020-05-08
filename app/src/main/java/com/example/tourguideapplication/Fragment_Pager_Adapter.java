package com.example.tourguideapplication;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class Fragment_Pager_Adapter extends FragmentPagerAdapter {
    Context context;
    int tabCount;
    public Fragment_Pager_Adapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    public Fragment_Pager_Adapter(MainActivity mainActivity, FragmentManager supportFragmentManager, int tabCount) {

        super(supportFragmentManager);
        this.tabCount = tabCount;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
            return new LakesFragment();
            case 1:
            return new LakesFragment();
            default:
                return new LakesFragment();
        }
    }

    @Override
    public int getCount() {
        return tabCount;
    }
}
