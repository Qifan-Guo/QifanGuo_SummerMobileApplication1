package com.qifan.qifanguo_summermobileapplication1.adapter;

import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

import com.qifan.qifanguo_summermobileapplication1.ScalePagerActivity;

import java.util.ArrayList;

public class ScalePagerAdapter extends PagerAdapter {
    private ArrayList<View> list =new ArrayList<>();

    public ScalePagerAdapter(ArrayList<View> list) {
        this.list=list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view.equals(object);
        }


    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView(list.get(position));
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        container.addView(list.get(position),0);
        return list.get(position);
    }
}
