package com.qifan.qifanguo_summermobileapplication1;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.qifan.qifanguo_summermobileapplication1.Fragment.viewPagerRed;
import com.qifan.qifanguo_summermobileapplication1.Fragment.viewPagerGreen;
import com.qifan.qifanguo_summermobileapplication1.Fragment.viewPagerBlue;
import com.qifan.qifanguo_summermobileapplication1.Adapter.ViewPagerAdapter;

import java.util.ArrayList;

public class ViewPagerActivity extends AppCompatActivity{
    String TAG= "LifeCycle";
    ArrayList<Fragment> viewPagerList= new ArrayList<Fragment>();
    ViewPagerAdapter viewPagerAdapter;
    ViewPager viewPager;

    public ViewPagerActivity() {
    }


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.viewpager);
        Log.d("LifeCycle", "onCreate: ");
        viewPager=findViewById(R.id.viewPager);
        viewPagerList.add(new viewPagerBlue());
        viewPagerList.add(new viewPagerRed());
        viewPagerList.add(new viewPagerGreen());
        viewPagerAdapter=new ViewPagerAdapter(getSupportFragmentManager(),viewPagerList);
        viewPager.setAdapter(viewPagerAdapter);

        }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("LifeCycle", "onCreate: ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("LifeCycle", "onRestart: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: ");
    }
}
