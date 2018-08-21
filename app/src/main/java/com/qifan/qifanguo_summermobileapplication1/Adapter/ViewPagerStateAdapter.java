package com.qifan.qifanguo_summermobileapplication1.Adapter;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.util.Pair;

import java.util.ArrayList;

public class ViewPagerStateAdapter extends FragmentStatePagerAdapter {

    private final ArrayList<Pair<String, Fragment>> list;

    public ViewPagerStateAdapter(FragmentManager fragmentManager, ArrayList<Pair<String,Fragment>> list){
        super(fragmentManager);
        this.list=list;

    }
    @Override
    public Fragment getItem(int position) {
        return list.get(position).second;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return list.get(position).first;
    }
}
