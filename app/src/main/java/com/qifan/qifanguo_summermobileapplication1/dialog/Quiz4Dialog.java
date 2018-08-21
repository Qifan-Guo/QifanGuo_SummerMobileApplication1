package com.qifan.qifanguo_summermobileapplication1.dialog;

import android.app.Dialog;
import android.content.Context;
import android.support.annotation.NonNull;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.qifan.qifanguo_summermobileapplication1.Fragment.DemoFragment;
import com.qifan.qifanguo_summermobileapplication1.R;
import com.qifan.qifanguo_summermobileapplication1.quiz4Interface;

import butterknife.ButterKnife;
import butterknife.OnClick;



public class Quiz4Dialog extends Dialog implements quiz4Interface {
    RadioGroup radioGroup;
    Context context1;
    int checkID;
    String exit = "exit";

    @OnClick(R.id.quiz4_ok)
    public void exitDialog(){
        switch (checkID){
            case R.id.quiz4_yes:
                yes();
                case R.id.quiz4_no:
               no();

            case R.id.quiz4_exit:
                exit();



        }





    }



    public Quiz4Dialog(@NonNull Context context) {
        super(context);
        this.context1=context;
        setContentView(R.layout.quiz4);
        ButterKnife.bind(this);
        radioGroup=findViewById(R.id.quiz4_radioGroup);



        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                checkID=checkedId;
            }
        });
    }

    @Override
    public void yes() {
        this.cancel();
        Toast.makeText(this.getContext(),"Yes",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void no() {
        this.cancel();
        Toast.makeText(this.getContext(),"No",Toast.LENGTH_SHORT).show();
    }



    @Override
    public void exit() {
        this.cancel();

    }
}
