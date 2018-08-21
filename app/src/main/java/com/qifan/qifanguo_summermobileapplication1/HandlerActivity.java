package com.qifan.qifanguo_summermobileapplication1;

import android.annotation.SuppressLint;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.logging.Handler;
import java.util.logging.LogRecord;

import butterknife.BindView;
import butterknife.ButterKnife;

public class HandlerActivity extends BaseActivity {
    @BindView(R.id.input_number)
    EditText editText;
    @BindView(R.id.timer_button)
    Button button;
    View.OnClickListener onStartListner;
    View.OnClickListener onStopListner;
    View.OnClickListener onResetListner;
    final static int CountDown=1217;
    int time;
    private static boolean pause=false;
    android.os.Handler handler = new android.os.Handler();

    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            if(time>0&&pause==false){
                --time;
                editText.setText(String.valueOf(time));
                handler.postDelayed(runnable,1000);

            }
        }
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_handler);
        ButterKnife.bind(this);



        onStartListner=new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makeToast("On Start Button");
                button.setText("Stop");
                time=Integer.parseInt(editText.getText().toString());
                handler.postDelayed(runnable,1000);
                button.setOnClickListener(onStopListner);
            }
        };

        onStopListner=new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pause=true;

                makeToast("On Stop Button");
                button.setText("On Reset");
                button.setOnClickListener(onResetListner);
            }
        };


        onResetListner=new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editText.setText("");
                makeToast("On Stop Button");
                button.setText("Start");
                button.setOnClickListener(onStartListner);
            }
        };
        button.setOnClickListener(onStartListner);
    }




}
