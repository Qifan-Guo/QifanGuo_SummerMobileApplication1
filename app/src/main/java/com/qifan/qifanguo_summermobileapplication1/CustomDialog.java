package com.qifan.qifanguo_summermobileapplication1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;

import com.qifan.qifanguo_summermobileapplication1.dialog.DialogWindow;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class CustomDialog extends BaseActivity {
    int checkID;
    @BindView(R.id.RadioGroup)
    RadioGroup radioGroup;
    DialogWindow dialogWindow;
    @OnClick(R.id.submit_button)
    public void submit(View view){
        switch (checkID){
        case R.id.RadioButton1:
            new DialogWindow(this,0).show();
            break;
            case R.id.RadioButton2:
                new DialogWindow(this,0).show();
                break;
            case R.id.RadioButton3:
                new DialogWindow(this,0).show();

                break;
            case R.id.RadioButton4:
                new DialogWindow(this,0).show();
                break;
            case R.id.RadioButton5:
                new DialogWindow(this,1).show();
                break;

        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_dialog);
        ButterKnife.bind(this);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                checkID=checkedId;
            }
        });
    }
}
