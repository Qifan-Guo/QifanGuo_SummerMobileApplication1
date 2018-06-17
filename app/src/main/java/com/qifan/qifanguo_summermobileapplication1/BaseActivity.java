package com.qifan.qifanguo_summermobileapplication1;

import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import butterknife.OnClick;

public class BaseActivity extends AppCompatActivity {
    public void makeToast(String toast){
        Toast.makeText(this,toast,Toast.LENGTH_SHORT).show();
    }
}
