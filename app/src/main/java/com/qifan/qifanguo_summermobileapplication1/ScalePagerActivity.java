package com.qifan.qifanguo_summermobileapplication1;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;

import com.qifan.qifanguo_summermobileapplication1.Adapter.ScalePagerAdapter;

import java.util.ArrayList;

public class ScalePagerActivity extends AppCompatActivity{
    private ViewPager viewPager;
    private ScalePagerAdapter scalePagerAdapter;
    ArrayList<View> list = new ArrayList<>();
    private View centerView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scalepager);
        viewPager = findViewById(R.id.scalePager);
        LayoutInflater layoutInflater=getLayoutInflater().from(this);
        list.add(layoutInflater.inflate(R.layout.scalepager_centerinside,null));
        list.add(layoutInflater.inflate(R.layout.scalepager_center,null));
        list.add(layoutInflater.inflate(R.layout.scalepager_centercrop,null));
        list.add(layoutInflater.inflate(R.layout.scalepager_matrix,null));

        scalePagerAdapter=new ScalePagerAdapter(list);
        viewPager.setAdapter(scalePagerAdapter);

    }
}