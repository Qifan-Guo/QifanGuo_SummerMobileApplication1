package com.qifan.qifanguo_summermobileapplication1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.qifan.qifanguo_summermobileapplication1.Adapter.AdvanceListViewAdapter;
import com.qifan.qifanguo_summermobileapplication1.Adapter.AdvanceListViewAdapter2;
import com.qifan.qifanguo_summermobileapplication1.Bean.Msg;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class AdvanceListView2 extends AppCompatActivity {
    @BindView(R.id.activity_advance_list_view)
    ListView listView;
    ArrayList<Msg> chatMessage=new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advance_list_view);
        ButterKnife.bind(this);
        populatedChatMessage(chatMessage);
        AdvanceListViewAdapter2 advanceListViewAdapter=new AdvanceListViewAdapter2(chatMessage,this);
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
