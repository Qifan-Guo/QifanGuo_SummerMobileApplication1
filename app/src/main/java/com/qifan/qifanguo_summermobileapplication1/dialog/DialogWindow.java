package com.qifan.qifanguo_summermobileapplication1.dialog;

import android.app.Dialog;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.qifan.qifanguo_summermobileapplication1.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class DialogWindow extends Dialog {
    final int rightAnswer=1;
    final int wrongAnswer=0;

    @OnClick(R.id.dialog_ok)
    public void ok(View view){
        this.cancel();
    }
    @BindView(R.id.Answer)
    ImageView imageView;

    @BindView(R.id.dialog_title)
    TextView dialog_title;



    public DialogWindow(@NonNull Context context,int x) {
        super(context,R.style.Dialog);
        setContentView(R.layout.dialog_window);
        ButterKnife.bind(this);
        if(x==rightAnswer){
            imageView.setImageResource(R.drawable.check);
            dialog_title.setText("Correct!");
        }else{
            imageView.setImageResource(R.drawable.wrong);
            dialog_title.setText("Wrong!");
        }



    }
}
