package com.qifan.qifanguo_summermobileapplication1.Fragment;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Pair;

import com.qifan.qifanguo_summermobileapplication1.Adapter.ViewPagerStateAdapter;
import com.qifan.qifanguo_summermobileapplication1.R;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class viewPagerState extends AppCompatActivity {
    @BindView(R.id.tabLayout)
    TabLayout tabLayout;
    @BindView(R.id.viewPagerState)
    ViewPager viewPager;

    ArrayList<Pair<String,Fragment>> list = new ArrayList<>();
    ViewPagerStateAdapter viewPagerStateAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager_state);
        ButterKnife.bind(this);
        list.add(new Pair<String, Fragment>("Red",new viewPagerRed()));
        list.add(new Pair<String, Fragment>("Green",new viewPagerGreen()));
        list.add(new Pair<String, Fragment>("Blue",new viewPagerBlue()));
        viewPagerStateAdapter= new ViewPagerStateAdapter(getSupportFragmentManager(),list);
        viewPager.setAdapter(viewPagerStateAdapter);
        tabLayout.setupWithViewPager(viewPager);

    }
}
