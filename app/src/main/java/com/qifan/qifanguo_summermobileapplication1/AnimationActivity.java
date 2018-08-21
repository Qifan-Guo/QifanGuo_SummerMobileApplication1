package com.qifan.qifanguo_summermobileapplication1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class AnimationActivity extends AppCompatActivity {
    @BindView(R.id.blue_box)
    TextView textView;
    private Animation alphaAnimation;
    private Animation transAnimation;
    private Animation setAnimation;
    private Animation rotateAnimation;
    private Animation scaleAnimation;

    @OnClick(R.id.animation_alpha)
    public void animation_alpha(){
        textView.startAnimation(alphaAnimation);

    }
    @OnClick(R.id.animation_scale)
    public void animation_scale(){textView.startAnimation(scaleAnimation);}
    @OnClick(R.id.animation_rotate)
    public void animation_rotate(){textView.startAnimation(rotateAnimation);}
    @OnClick(R.id.animation_set)
    public void animation_set(){textView.startAnimation(setAnimation);}
    @OnClick(R.id.animation_trans)
    public void animation_trans(){textView.startAnimation(transAnimation);}


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animation);
        ButterKnife.bind(this);
        initAnimation();

    }


    public void initAnimation (){
        alphaAnimation= AnimationUtils.loadAnimation(this,R.anim.anim_alpha);
        transAnimation= AnimationUtils.loadAnimation(this,R.anim.anim_trans);
        setAnimation= AnimationUtils.loadAnimation(this,R.anim.anim_set);
        rotateAnimation= AnimationUtils.loadAnimation(this,R.anim.anim_rotate);
        scaleAnimation= AnimationUtils.loadAnimation(this,R.anim.anim_scale);


    }
}
