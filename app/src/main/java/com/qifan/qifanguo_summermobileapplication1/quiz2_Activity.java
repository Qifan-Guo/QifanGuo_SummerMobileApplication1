package com.qifan.qifanguo_summermobileapplication1;

import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.qifan.qifanguo_summermobileapplication1.Adapter.AdvanceListViewAdapter;
import com.qifan.qifanguo_summermobileapplication1.Adapter.ViewPagerAdapter;
import com.qifan.qifanguo_summermobileapplication1.Bean.Msg;
import com.qifan.qifanguo_summermobileapplication1.Fragment.viewPagerBlue;
import com.qifan.qifanguo_summermobileapplication1.Fragment.viewPagerGreen;
import com.qifan.qifanguo_summermobileapplication1.Fragment.viewPagerRed;


import java.lang.reflect.Array;
import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class quiz2_Activity extends AppCompatActivity {
    @BindView(R.id.activity_advance_list_view)
    ListView listView;
    ArrayList<Msg> chatMessage=new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advance_list_view);
        ButterKnife.bind(this);
        populatedChatMessage(chatMessage);
        AdvanceListViewAdapter advanceListViewAdapter=new AdvanceListViewAdapter(chatMessage,this);
        LayoutInflater inflater=getLayoutInflater();
       // ViewPager viewPager=findViewById(R.id.quiz2_viewPager);
        ViewPager viewPager = (ViewPager) getLayoutInflater().inflate(
                R.layout.header, null);
        viewPager.setLayoutParams(new ListView.LayoutParams(
                ListView.LayoutParams.MATCH_PARENT, 300));
        ArrayList<Fragment> viewPagerList=new ArrayList<>();
        viewPagerList.add(new viewPagerBlue());
        viewPagerList.add(new viewPagerRed());
        viewPagerList.add(new viewPagerGreen());
        ViewPagerAdapter viewPagerAdapter=new ViewPagerAdapter(getSupportFragmentManager(),viewPagerList);
        viewPager.setAdapter(viewPagerAdapter);


        listView.addHeaderView(viewPager);

        listView.setAdapter(advanceListViewAdapter);
    }

    public void populatedChatMessage(ArrayList<Msg> chatMessage){
        chatMessage.add(new Msg("hello",0));
        chatMessage.add(new Msg("My Name is Qifan",0));
        chatMessage.add(new Msg("Hi! How are You,My Name is Jonh",1));
        chatMessage.add(new Msg("what is the HW for today",0));
        chatMessage.add(new Msg("blabhblabjhakjgfakljfgalkjaskljfasklfjaslkdfjasdklfjasdlkfjadslkfjasdlkfjaslkfjasdlkfjasdlkfjasdlfkjasdlkfjasdklfj",1));
        chatMessage.add(new Msg("hello",0));
        chatMessage.add(new Msg("hello",1));
        chatMessage.add(new Msg("hello",1));
        chatMessage.add(new Msg("hello",0));
        chatMessage.add(new Msg("hello",0));
        chatMessage.add(new Msg("hello",1));
        chatMessage.add(new Msg("hello",0));
        chatMessage.add(new Msg("hello",1));
        chatMessage.add(new Msg("hello",0));



    }
}
