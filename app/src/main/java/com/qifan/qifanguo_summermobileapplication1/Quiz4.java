package com.qifan.qifanguo_summermobileapplication1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.qifan.qifanguo_summermobileapplication1.dialog.DialogWindow;
import com.qifan.qifanguo_summermobileapplication1.dialog.Quiz4Dialog;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class Quiz4 extends BaseActivity{

    Button button;
    @OnClick(R.id.openDialog)
    public void openDialog(){
        new Quiz4Dialog(this).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz4);
        button=findViewById(R.id.openDialog);
        ButterKnife.bind(this);


    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("LOG1","ONStop");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("LOG1","ONPAUSE");
        hello("exit");
    }

    public void hello(String value){
        Intent result = new Intent();
        result.putExtra("exit",value);
        setResult(1,result);


    }
}
